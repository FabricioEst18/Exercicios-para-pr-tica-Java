package Exercicio01;

import java.util.Scanner;

/*  13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println(nome + ",você é uma pessoa MAIOR DE IDADE.");
        } else {
            System.out.println(nome + ",você é uma pessoa MENOR DE IDADE");
        }

        scanner.close();
    }
}
