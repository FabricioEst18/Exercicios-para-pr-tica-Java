package Exercicio01;

import java.util.Scanner;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a primeira nota: ");
        double numeroUm = scanner.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        double numeroDois = scanner.nextDouble();
        System.out.println("Escreva a terceira nota: ");
        double numeroTres = scanner.nextDouble();

        double mediaDasNotas = numeroUm + numeroDois + numeroTres / 3;

        System.out.println("A média das notas é :" + mediaDasNotas);
        scanner.close();
    }
}
