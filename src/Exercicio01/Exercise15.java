package Exercicio01;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/* 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
 */
public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva em que você nasceu: ");
        int ano = scanner.nextInt();
        System.out.println("Escreva o mês em que você nasceu: ");
        int mes = scanner.nextInt();
        System.out.println("Escreva o dia em que você nasceu: ");
        int dia = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano,mes,dia);

        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        System.out.println("Você já viveu: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");


        scanner.close();
    }
}
