package Exercicio01;

import java.util.Scanner;

/*
21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
 */
public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da hora-aula: R$ ");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite o número de aulas lecionadas no mês: ");
        int numeroAulas = scanner.nextInt();
        System.out.println("Digite o percentual de desconto do INSS (%): ");
        double percentualInss = scanner.nextDouble();

        double salarioBruto = valorHora * numeroAulas;

        double descontoInns = salarioBruto * (percentualInss / 100);

        double salarioLiquido = salarioBruto - descontoInns;

        System.out.println("====RESULTADO====");
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS: R$ " + descontoInns);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
