package Exericios02;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
// total do seu salário no referido mês.

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quanto você ganha por hora: ");
        double ganhosPorHora = scanner.nextDouble();
        System.out.println("Digite quantas horas por mês você trabalhou: ");
        int horasTrabalhadas = scanner.nextInt();

        double salárioDoMes = ganhosPorHora * horasTrabalhadas;
        System.out.println("O seu salário nesse mês foi de " + salárioDoMes);

        scanner.close();
    }
}
