package Exercicio01;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
public class Exercise08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (true/false): ");
        boolean valorUm = scanner.nextBoolean();
        System.out.println("Digite o segundo valor (true/false): ");
        boolean valorDois = scanner.nextBoolean();

        if (valorUm && valorDois) {
            System.out.println("Ambos os valores são VERDADEIROS! ");
        } else if (!valorUm && !valorDois) {
            System.out.println("Ambos os valores são FALSOS! ");
        } else {
            System.out.println("Os valores são diferentes.");
        }

        scanner.close();
    }
}

