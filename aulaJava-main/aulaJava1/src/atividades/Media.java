package atividades;

public class Media {
    public static void main(String[] args) {

        // Declaração de uma variável String para armazenar o nome do aluno
        String nome = "João";

        // Declaração das variáveis double com as notas dos quatro semestres
        double notaSemestre1 = 6.00;
        double notaSemestre2 = 6.00;
        double notaSemestre3 = 6.00;
        double notaSemestre4 = 6.00;

        // Cálculo e armazenamento da soma das notas
        double soma = notaSemestre1 + notaSemestre2 + notaSemestre3 + notaSemestre4;

        // Cálculo e armazenamento da média aritmética das notas
        double media = soma / 4;

        // Impressão da média do aluno
        System.out.println("O aluno(a) " + nome + " ficou com uma média de " + media);

        // Verificação se a média é maior ou igual a 6 para determinar se o aluno foi aprovado ou reprovado
        if (media >= 6){
            // Se a média for maior ou igual a 6, imprime que o aluno foi aprovado
            System.out.println("O aluno(a) " + nome + " foi aprovado(a)!");
        } else {
            // Caso contrário, imprime que o aluno foi reprovado
            System.out.println("O aluno(a) " + nome + " foi reprovado(a).");
        }

    }
}
