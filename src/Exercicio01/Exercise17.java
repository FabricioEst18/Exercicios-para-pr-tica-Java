package Exercicio01;

import java.util.Scanner;

/*
17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
Fórmula: C = (5 * ( F-32) / 9)
 */
public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquise a temperatura da sua cidade em Fahrenheit,digite e lhe darei a temperatura em Celsius: ");
        int temperaturaF = scanner.nextInt();

        int temperaturaC = (5 * (temperaturaF - 32) / 9);

        System.out.println("A temperatura do seu local é de " + temperaturaC + " Celsius");

        scanner.close();
    }
}
