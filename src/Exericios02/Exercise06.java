package Exericios02;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do comprimento do quadrado: ");

        float comprimento = scanner.nextFloat();
        float areaDoQuadrado = comprimento * comprimento;


        System.out.println("A área do quadrado é igual a " + areaDoQuadrado);
        System.out.println("O dobro desta área é igual a " + areaDoQuadrado * areaDoQuadrado);

        scanner.close();
    }
}
