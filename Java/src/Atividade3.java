//Desenvolver um programa de cálculo de média para uma turma com 30 alunos listando as notas e nomes de alunos abaixo de 70% da media; entre 70 e 95%; por fim acima de 95%

import java.util.Scanner;

public class Atividade3 {
    static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Variáveis

        int totalAlunos, abaixo70, entre70e95, acima95, i;
        float media, somaNotas;

        // Arrays

        String[] nomes = new String[8];
        float[] notas = new float[8];

        // Zerando valores

        totalAlunos = 8;
        somaNotas = 0;
        abaixo70 = 0;
        entre70e95 = 0;
        acima95 = 0;

        // For para nome de alunos

        for (i = 0; i < nomes.length; i++) {

            System.out.print("Insira o nome do aluno: ");
            nomes[i] = leia.next();

            System.out.print("Insira a nota do aluno " + nomes[i] + ": ");
            notas[i] = leia.nextFloat();

            somaNotas = somaNotas + notas[i];

        }

        // Calcular a média

        media = somaNotas / totalAlunos;

        // Exibir média

        System.out.println("A média da turma é: " + media);

        // Listar alunos conforme faixa de nota

        System.out.println("Alunos abaixo de 70% da média:");

        // For para abaixo de 70

        for (i = 0; i < totalAlunos; i++) {
            if (notas[i] < 70) {
                System.out.println("----------------------------------");
                System.out.printf("| %-10s | %-10s |\n", "Aluno", "Nota");
                System.out.println("----------------------------------");
                System.out.printf("| %-10s | %-10.2f |\n", nomes[i], notas[i]);
                System.out.println("----------------------------------");
                abaixo70 = abaixo70 + 1;
            }

        }

        System.out.println("Alunos entre 70% e 95% da média:");

        // For para entre 70 e 95

        for (i = 0; i < totalAlunos; i++) {
            if (notas[i] >= 70 && notas[i] <= 95) {
                System.out.println("----------------------------------");
                System.out.printf("| %-10s | %-10s |\n", "Aluno", "Nota");
                System.out.println("----------------------------------");
                System.out.printf("| %-10s | %-10.2f |\n", nomes[i], notas[i]);
                System.out.println("----------------------------------");
                entre70e95 = entre70e95 + 1;
            }
        }

        System.out.println("Alunos entre 70% e 95% da média:");

        // For para acima de 95

        for (i = 0; i < totalAlunos; i++) {
            if (notas[i] > 95) {
                System.out.println("----------------------------------");
                System.out.printf("| %-10s | %-10s |\n", "Aluno", "Nota");
                System.out.println("----------------------------------");
                System.out.printf("| %-10s | %-10.2f |\n", nomes[i], notas[i]);
                System.out.println("----------------------------------");
                acima95 = acima95 + 1;
            }
        }
    }
}

