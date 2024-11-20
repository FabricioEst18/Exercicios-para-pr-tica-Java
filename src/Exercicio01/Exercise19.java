package Exercicio01;

import java.util.Scanner;

/*
20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
 */
public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro e lhe entregarei a sua tabuada: ");
        int valor = scanner.nextInt();

        System.out.println("Tabuada do número " + valor + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        scanner.close();
    }
}
