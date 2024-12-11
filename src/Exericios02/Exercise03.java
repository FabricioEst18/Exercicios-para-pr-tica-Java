package Exericios02;

import java.util.Scanner;

/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: "Telefonou para a vítima?"
"Esteve no local do crime?" "Mora perto da vítima?" "Devia para a vítima?" "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 */
public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntas
        String[] questions = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int positiveAnswers = 0;

        // Fazer as perguntas
        System.out.println("Responda com 'sim' ou 'não':");
        for (String question : questions) {
            System.out.println(question);
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("sim")) {
                positiveAnswers++;
            }
        }

        String classification;
        if (positiveAnswers == 2) {
            classification = "Suspeita";
        } else if (positiveAnswers >= 3 && positiveAnswers <= 4) {
            classification = "Cúmplice";
        } else if (positiveAnswers == 5) {
            classification = "Assassino";
        } else {
            classification = "Inocente";
        }

        System.out.println("Classificação: " + classification);

        scanner.close();
    }
}