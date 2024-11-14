package Exercicio01;

import java.util.Scanner;

// 14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class Exercise14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int valorA = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int valorB = scanner.nextInt();

        System.out.println("Valores antes da troca: ");
        System.out.println("Valor de A = " + valorA);
        System.out.println("valor de B = " + valorB);

        int troca = valorA;
        valorA = valorB;
        valorB = troca;

        System.out.println("Valores depois da troca: ");
        System.out.println("Valor de A = " + valorA);
        System.out.println("Valor de B = " + valorB);

        scanner.close();
    }
}
