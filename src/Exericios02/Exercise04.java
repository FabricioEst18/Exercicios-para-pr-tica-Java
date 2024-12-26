package Exericios02;

import java.util.Scanner;

/*
Faça um Programa que converta metros para centímetros.
 */
public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque um valor em metros: ");
        int valor = scanner.nextInt();

        int conversao = valor * 100;

        System.out.println("O valor " + valor + " metros, é igual a " + conversao + " centímetros");

        scanner.close();
    }
}
