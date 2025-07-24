package jurosCompostos01;

import java.util.Scanner;



public class calculadora {
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


// f