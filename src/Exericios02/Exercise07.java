package Exericios02;
/*
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.


 */

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede");
        double comprimento = scanner.nextDouble();
        System.out.println("Digite a largura da parede");
        double largura = scanner.nextDouble();

        double areaDaParede = comprimento * largura;

        double tintaNecessaria = areaDaParede / 3;

        double latasNecessarias;

        scanner.close();
    }
}
