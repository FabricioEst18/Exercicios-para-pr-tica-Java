package Exercicio02;

import java.util.Scanner;

// 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0 && numero >= 0) {
            System.out.println("Esse número é par e positivo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("Esse número é par e negativo");
        } else if (numero % 2 != 0 && numero >= 0) {
            System.out.println("Esse número é ímpar e positivo");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println("Esse número é ímpar e negativo");
        }

    }
}
