package Exercicio01;

import java.util.Scanner;

/*  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em duas vezes (sem juros)");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais (10% de juros)");

        System.out.print("Digite o número da forma de pagamento: ");
        int codigoPagamento = scanner.nextInt();

        double valorFinal;

        switch (codigoPagamento) {
            case 1:
                valorFinal = valorProduto * 0.85;
                System.out.printf("O valor final a ser pago com 15%% de desconto é: R$ %.2f\n", valorFinal);
                break;
            case 2:
                valorFinal = valorProduto * 0.90;
                System.out.printf("O valor final a ser pago com 10%% de desconto é: R$ %.2f\n", valorFinal);
                break;
            case 3:
                valorFinal = valorProduto;
                System.out.printf("O valor final a ser pago em duas vezes (preço normal) é: R$ %.2f\n", valorFinal);
                break;
            case 4:
                valorFinal = valorProduto * 1.10;
                System.out.printf("O valor final a ser pago com 10%% de juros é: R$ %.2f\n", valorFinal);
                break;
            default:
                System.out.println("Código de pagamento inválido. Por favor, escolha uma opção válida.");
        }
        scanner.close();
    }

}

