package Exercicio03;

import java.util.Scanner;

/* 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int valorB = scanner.nextInt();
        scanner.close();

        System.out.println("---------------------------");

        int C;
        if (valorA == valorB) {
            C = valorA + valorB;
            System.out.println("O resultado da soma do valor A = " + valorA + " e valor B = " + valorB + " é igual a: " + C);
        } else if (valorA != valorB) {
            C = valorA * valorB;
            System.out.println("O resultado da multiplicação do valor A = " + valorA + " e valor B = " + valorB + " é igual a: " + C);
        }

    }
}
