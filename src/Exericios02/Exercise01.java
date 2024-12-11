package Exericios02;

import java.util.Scanner;

// Faça um Programa que peça dois números e imprima o maior deles.

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro valor: ");
        int valorUm = scanner.nextInt();
        System.out.println("Escreva o segundo valor:");
        int valorDois = scanner.nextInt();

        if(valorUm > valorDois){
            System.out.println("O primeiro valor: " + valorUm + " é maior que o segundo valor: " + valorDois);
        }else if (valorUm < valorDois){
            System.out.println("O segundo valor: " + valorDois + " é maior que o primeiro valor: " + valorUm);
        }else {
            System.out.println("Os valores são iguais,2 " + " primero valor: " + valorUm + " segundo valor: " + valorDois);
        }

        scanner.close();
    }
}
