package Exericios02;

import java.util.Scanner;

// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual será o diâmetro de círculo:");
        float diametroDoCirculo = scanner.nextFloat();

        float raioDoCirculo = diametroDoCirculo / 2;
        double areaDoCirculo = 3.14 * raioDoCirculo *raioDoCirculo ;

        System.out.println("Raio do círculo: " + raioDoCirculo);
        System.out.println("Área do círculo: " + areaDoCirculo);

        scanner.close();
    }
}
