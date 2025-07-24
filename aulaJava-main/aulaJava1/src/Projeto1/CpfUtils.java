package Projeto1;


import java.util.Random;
import java.util.Scanner;

public final class CpfUtils {

   private static final Random RANDOM = new Random();  //  o private static final ele tem imutabilidade sendo uma boa pratica de programação (constante, não pode ser alterado)


   private CpfUtils() {}

   public static String generate(boolean withMask) {  //  flag (sinalizador) que indica se o CPF deve ser retornado com pontuação (máscara) ou apenas os números.
      int[] digits = new int[11]; // Vetor que vai armazenar os 11 dígitos do CPF

      // Gera os 9 primeiros dígitos aleatoriamente
      for (int i = 0; i < 9; i++) {
         digits[i] = RANDOM.nextInt(10); // Gera número de 0 a 9
      }

      // Calcula o 1º dígito verificador (posição 9 do vetor)
      digits[9]  = calcCheckDigit(digits, 9);
      // Calcula o 2º dígito verificador (posição 10 do vetor)
      digits[10] = calcCheckDigit(digits, 10);

      // Monta o CPF como uma string, com ou sem pontuação
      StringBuilder sb = new StringBuilder(11); // StringBuilder para performance
      for (int d : digits) sb.append(d); // Adiciona cada dígito ao StringBuilder

      // Se withMask for true, chama o método mask() para aplicar os pontos e traço
      // Caso contrário, retorna só os números

      return withMask ? mask(sb.toString()) : sb.toString();
   }



   // Valida se um CPF fornecido é válido de acordo com os dígitos verificadores
   public static boolean validate(String cpf) {
      // Remove qualquer máscara (pontos e traço)
      String onlyDigits = unmask(cpf);

      // Verifica se o resultado é nulo ou tem quantidade diferente de 11 dígitos
      if (onlyDigits == null || onlyDigits.length() != 11) return false;

      // Verifica se todos os dígitos são iguais (ex: 111.111.111-11), que é inválido
      if (allDigitsEqual(onlyDigits)) return false;

      // Converte a string de dígitos em um array de inteiros (ex: "123" → [1,2,3])
      int[] digits = onlyDigits.chars().map(c -> c - '0').toArray();

      // Calcula o 1º dígito verificador com base nos 9 primeiros números
      int d1 = calcCheckDigit(digits, 9);

      // Calcula o 2º dígito verificador com base nos 9 números + d1
      int d2 = calcCheckDigit(digits, 10);

      // Verifica se os dígitos calculados são iguais aos dígitos fornecidos (posições 9 e 10)
      return digits[9] == d1 && digits[10] == d2;
   }



   // Aplica a máscara de formatação ao CPF: xxx.xxx.xxx-xx
   public static String mask(String cpf) {

      // Remove qualquer caractere que não seja número
      String onlyDigits = unmask(cpf);

      // Se não for exatamente 11 dígitos, retorna o CPF original
      if (onlyDigits == null || onlyDigits.length() != 11) return cpf;

      // Aplicar a formatação com pontos
      return String.format("%s.%s.%s-%s",
              onlyDigits.substring(0, 3), // primeiros 3 dígitos
              onlyDigits.substring(3, 6),  // segundo bloco de 3
              onlyDigits.substring(6, 9),  // terceiro bloco de 3
              onlyDigits.substring(9, 11));  // dígitos verificadores
   }



   // Remove a máscara de um CPF, deixando apenas os números
   public static String unmask(String cpf) {
      // Se CPF for nulo, retorna nulo
      if (cpf == null) return null;

      // Expressão regular "\\D" remove todos os caracteres que NÃO são dígitos
      return cpf.replaceAll("\\D", "");
   }



   // Verifica se todos os caracteres da string são iguais
   private static boolean allDigitsEqual(String s) {
      char first = s.charAt(0); // Armazena o primeiro caractere

      // Compara todos os outros caracteres com o primeiro
      for (int i = 1; i < s.length(); i++) {
         if (s.charAt(i) != first) return false;
      }

      // Se todos forem iguais, retorna verdadeiro (ex: "00000000000")
      return true;
   }



   // Calcula um dígito verificador (1º ou 2º) com base no CPF informado
   private static int calcCheckDigit(int[] digits, int limit) {
      int pesoInicial = limit + 1; // 10 para o primeiro DV, 11 para o segundo
      int soma = 0;

      // Multiplica os dígitos pelos pesos decrescentes e soma
      for (int i = 0; i < limit; i++) {
         soma += digits[i] * (pesoInicial - i);
      }

      // Calcula o resto da divisão por 11
      int resto = soma % 11;

      // Se o resto for menor que 2, o dígito é 0; senão, 11 - resto
      return (resto < 2) ? 0 : (11 - resto);

   }
}






