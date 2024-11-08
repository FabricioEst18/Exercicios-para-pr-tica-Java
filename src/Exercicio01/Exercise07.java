package Exercicio01;

import java.util.Scanner;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Exercise07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro valor: ");
        int valorUm = scanner.nextInt();
        System.out.println("Escreva o segundo valor: ");
        int valorDois = scanner.nextInt();
        System.out.println("Escreva o terceiro valor: ");
        int valorTres = scanner.nextInt();

        if (valorUm >= valorDois && valorUm >= valorTres) {
            if (valorDois >= valorTres) {
                System.out.println("Ordem decrescente: " + valorUm + " " + valorDois + " " + valorTres);
            } else {
                System.out.println("Ordem decrescente: " + valorUm + " " + valorTres + " " + valorDois);
            }
        } else if (valorDois >= valorUm && valorDois >= valorTres) {
            if (valorUm >= valorTres) {
                System.out.println("Ordem decrescente: " + valorDois + " " + valorUm + " " + valorTres);
            } else {
                System.out.println("Ordem decrescente: " + valorDois + " " + valorTres + " " + valorUm);
            }
        }else {
            if (valorUm >= valorDois){
                System.out.println("Ordem decrescente: " + valorTres + " " + valorUm + " " + valorDois);
            }else {
                System.out.println("Ordem decrescente: " + valorTres + " " + valorDois + " " + valorUm);
            }
        }

        scanner.close();
    }
}
