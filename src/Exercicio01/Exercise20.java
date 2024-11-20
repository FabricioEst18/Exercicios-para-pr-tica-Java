package Exercicio01;

import java.util.Scanner;

/*
22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
 */
public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor inteiro de A: ");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor inteiro de B: ");
        int valorB = scanner.nextInt();

        int quociente = valorA / valorB;
        int restoDaDivisão = valorA % valorB;

        System.out.println("O valor do quociente entre os valores A e B: " + quociente);
        System.out.println("O valor do resto da divisão entre os valores A e B: " + restoDaDivisão);

        scanner.close();
    }
}
