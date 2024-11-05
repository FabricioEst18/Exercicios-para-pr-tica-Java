package Exercicio01;

import java.util.Scanner;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um valor: ");
        double valor = scanner.nextDouble();
        double valorReajustado = valor * 1.05;
        System.out.println("O valor dado com reajuste é: " + valorReajustado);

        scanner.close();
    }
}
