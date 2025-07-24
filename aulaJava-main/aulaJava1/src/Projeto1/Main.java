package Projeto1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CPF Tool ===");
            System.out.println("1) Gerar CPF sem máscara");
            System.out.println("2) Gerar CPF com máscara");
            System.out.println("3) Validar CPF");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");

            while (!sc.hasNextInt()) {
                System.out.print("Opção inválida. Digite novamente: ");
                sc.next();
            }
            opcao = sc.nextInt();
            sc.nextLine(); // consumir newline

            switch (opcao) {
                case 1 -> {
                    String cpf = CpfUtils.generate(false);
                    System.out.println("CPF gerado: " + cpf);
                }
                case 2 -> {
                    String cpf = CpfUtils.generate(true);
                    System.out.println("CPF gerado: " + cpf);
                }
                case 3 -> {
                    System.out.print("Digite o CPF para validar: ");
                    String input = sc.nextLine();
                    boolean valido = CpfUtils.validate(input);
                    System.out.println(valido ? "CPF válido!" : "CPF inválido!");
                    if (valido) {
                        System.out.println("Com máscara: " + CpfUtils.mask(input));
                        System.out.println("Sem máscara: " + CpfUtils.unmask(input));
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

