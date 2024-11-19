package Exercicio01;

import java.util.Scanner;

/*
16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
equilátero, isósceles ou escaleno.
 */
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado A: ");
        int ladoA = scanner.nextInt();
        System.out.println("Digite o lado B: ");
        int ladoB = scanner.nextInt();
        System.out.println("Digite o lado C: ");
        int ladoC = scanner.nextInt();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("O triângulo é EQUILÁTERO.");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("O triãngulo é ISÓSCELES.");
        } else {
            System.out.println("O triângulo é ESCALENO.");
        }


        scanner.close();
    }
}
