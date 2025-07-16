package atividades;

public class Media {
    public static void main(String[] args) {

        String nome = "João";
        double notaSemestre1 = 6.00;
        double notaSemestre2 = 6.00;
        double notaSemestre3 = 6.00;
        double notaSemestre4 = 7.00;
        double soma = notaSemestre1 + notaSemestre2 + notaSemestre3 + notaSemestre4;
        double media = soma / 4;


        System.out.println("O aluno(a) " + nome + " ficou com uma média de " + media);
        if (media >= 6){
            System.out.println("O aluno(a) " + nome + " foi aprovado!");
        } else {
            System.out.println("O aluno(a) " + nome + " foi reprovado.");
        }


    }
}
