package calculadoraJuros01;

import java.util.Scanner;

/*
Comentado: código antigo que lê dois números inteiros e soma.
public class Terminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        int soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);

        scanner.close();
    }
}
*/



public class Terminal {
    public static void main(String[] args) {
        // Códigos para colorir os textos no terminal
        final String VERMELHO = "\u001B[31m";  // Cor vermelha para erros/alertas
        final String AMARELO = "\u001B[33m";   // Cor amarela (não usada neste código)
        final String CIANO = "\u001B[36m";     // Cor ciano para destaque na saída final
        final String AZUL = "\u001B[34m";      // Cor azul para as mensagens ao usuário

        // Cria objeto Scanner para pegar as informações digitadas pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor do investimento (VP)
        System.out.println(AZUL + "Digite o valor do investimento: ");
        double VP = scanner.nextDouble();

        // Solicita e lê a taxa de juros (i)
        System.out.println(AZUL + "Digite o valor do juros (ex: 0,05 para 5%):");
        double i = scanner.nextDouble();

        // Validação da taxa de juros: deve estar entre 0 e 1.0 (0% a 100%)
        while (i > 1.0 || i < 0) {
            // Exibe mensagem de erro em vermelho e pede para tentar novamente em azul
            System.out.println(VERMELHO + "Erro: O valor do juros deve estar entre 0 e 1.00 (ou 100%).\n" + AZUL + "Tente novamente (ex: 0,05 para 5%):");
            i = scanner.nextDouble();
        }

        // Solicita e lê o tempo do investimento (T)
        System.out.println(AZUL + "Digite o tempo do investimento: ");
        double T = scanner.nextDouble();

        // Variável para armazenar o tipo da taxa: mensal ('m') ou anual ('a')
        String tipoTaxa;

        // Loop para validar a entrada do tipo de taxa
        while (true) {
            System.out.println(AZUL + "A taxa de juros é mensal ou anual? (Digite 'm' para mensal ou 'a' para anual): ");
            tipoTaxa = scanner.next().toLowerCase();  // Converte entrada para minúsculo para facilitar comparação

            if (tipoTaxa.equals("m")) {
                // Se mensal, apenas sai do loop, sem alterar T
                break;
            } else if (tipoTaxa.equals("a")) {
                // Se anual, converte tempo para meses multiplicando por 12
                T = T * 12;
                break;
            } else {
                // Caso opção inválida, exibe mensagem em vermelho e repete o loop
                System.out.println(VERMELHO + "Opção inválida.");
            }
        }

        // Calcula o valor futuro (VF) usando fórmula de juros compostos: VF = VP * (1 + i)^T
        double VF = VP * Math.pow(1 + i, T);

        // Exibe o resultado final formatado com 2 casas decimais
        System.out.printf(CIANO + "O valor futuro do investimento de R$%.2f com juros de %.2f durante %.0f períodos será de: R$%.2f%n", VP, i, T, VF);

        scanner.close();  // Fecha o Scanner
    }
}
