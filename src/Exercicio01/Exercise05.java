package Exercicio01;

import java.util.Scanner;

// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class Exercise05 {
    public static void main(String[] args) {

        double salarioMinimo = 1293.20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu salário: ");
        double salarioUsuario = scanner.nextDouble();
        System.out.println("A quatidade de salários mínimos que esse usuário ganha é: " + salarioUsuario / salarioMinimo);
        scanner.close();
    }
}
