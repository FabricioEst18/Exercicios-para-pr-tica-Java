package Exercicio01;
// 1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int valorB = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        int valorC = scanner.nextInt();
        scanner.close();

        int somaDosValores = valorA + valorB;

        System.out.println("------------------------");

        System.out.println("A soma do valor de A = " + valorA + " e do valor de B = " + valorB + " é igual a " + somaDosValores);

        if (somaDosValores < valorC) {
            System.out.println("E a soma desses valores é menor que C.");
        } else {
            System.out.println("E a soma desses valores não é menor que C.");
        }
    }
}
