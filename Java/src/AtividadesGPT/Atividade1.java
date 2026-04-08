// Elaborar um algoritmo que leia três notas de um aluno, valide se os valores estão entre 0 e 10 e calcule a média aritmética. Caso algum valor seja inválido, o sistema deverá solicitar novamente a entrada até que seja válido. Ao final, exibir a média do aluno.

package AtividadesGPT;

import java.util.Scanner;

public class Atividade1 {
    public void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        float notaUm, notaDois, notaTres, media;

        // Recebimento de dados

        // 01

        System.out.print("Insira a nota da primeira prova entre 0 a 10: ");
        notaUm = leia.nextFloat();
        while (notaUm < 0 || notaUm > 10) {
            System.out.print("Valor inválido! Insira novamente: ");
            notaUm = leia.nextFloat();
        }
        //02

        System.out.print("Insira a nota da primeira prova entre 0 a 10: ");
        notaDois = leia.nextFloat();
        while (notaDois < 0 || notaDois > 10) {
            System.out.print("Valor inválido! Insira novamente: ");
            notaDois = leia.nextFloat();
        }
        //03

        System.out.print("Insira a nota da primeira prova entre 0 a 10: ");
        notaTres = leia.nextFloat();
        while (notaTres < 0 || notaTres > 10) {
            System.out.print("Valor inválido! Insira novamente: ");
            notaTres = leia.nextFloat();
        }

        media = (notaUm + notaDois + notaTres) / 3;

        System.out.println("A média do aluno é: " + media);
    }
}