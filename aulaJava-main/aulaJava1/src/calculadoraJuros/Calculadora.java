package calculadoraJuros;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora de Juros ===");
        System.out.print("Informe o capital inicial (ex: 1000): ");
        double capital = scanner.nextDouble();

        System.out.print("Informe a taxa de juros (ex: 0.05 para 5%): ");
        double taxa = scanner.nextDouble();

        System.out.print("Informe o tempo (em meses ou anos): ");
        int tempo = scanner.nextInt();

        System.out.print("É juros simples ou compostos? (s/c): ");
        char tipo = scanner.next().toLowerCase().charAt(0);

        if (tipo == 's') {
            double montante = capital * (1 + taxa * tempo);
            double juros = montante - capital;

            System.out.printf("Juros simples: R$ %.2f\n", juros);
            System.out.printf("Montante final: R$ %.2f\n", montante);
        } else if (tipo == 'c') {
            double montante = capital * Math.pow((1 + taxa), tempo);
            double juros = montante - capital;

            System.out.printf("Juros compostos: R$ %.2f\n", juros);
            System.out.printf("Montante final: R$ %.2f\n", montante);
        } else {
            System.out.println("Tipo de juros inválido.");
        }

        System.out.println("\nDeseja converter taxa mensal/anuais?");
        System.out.print("Digite 's' para sim ou qualquer tecla para sair: ");
        char opcao = scanner.next().toLowerCase().charAt(0);

        if (opcao == 's') {
            System.out.print("Converter de (m)ensal para (a)nual ou vice-versa? (m/a): ");
            char escolha = scanner.next().toLowerCase().charAt(0);

            if (escolha == 'm') {
                double taxaAnual = Math.pow(1 + taxa, 12) - 1;
                System.out.printf("Taxa anual equivalente: %.4f (%.2f%%)\n", taxaAnual, taxaAnual * 100);
            } else if (escolha == 'a') {
                double taxaMensal = Math.pow(1 + taxa, 1.0 / 12) - 1;
                System.out.printf("Taxa mensal equivalente: %.4f (%.2f%%)\n", taxaMensal, taxaMensal * 100);
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
