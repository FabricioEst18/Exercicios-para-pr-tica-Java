package Exercicio01;

import java.util.Scanner;

/* 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome aluno: ");
        String nome = scanner.next();
        System.out.println("Escreva a primeira nota: ");
        double numeroUm = scanner.nextDouble();
        System.out.println("Escreva a segunda nota: ");
        double numeroDois = scanner.nextDouble();
        System.out.println("Escreva a terceira nota: ");
        double numeroTres = scanner.nextDouble();
        System.out.println("Escreva a quarta nota: ");
        double numeroQuatro = scanner.nextDouble();

        double mediaDasNotas = numeroUm + numeroDois + numeroTres + numeroQuatro / 4;

        System.out.println("A média das notas é :" + mediaDasNotas);

        if (mediaDasNotas >= 7) {
            System.out.println("Parabéns! " + nome + " você foi APROVADO.");
        } else {
            System.out.println("Você está REPROVADO " + nome);
        }
        scanner.close();
    }
}
