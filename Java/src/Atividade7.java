// Insertion Sort

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int i, j, chave;

        // Arrays

        int[] lista = new int[5];

        // Inserindo no Array

        for (i = 0; i < lista.length; i++) {
            System.out.print("Insira um número para o array: ");
            lista[i] = leia.nextInt();
        }

        // Insertion Sort

        for (i = 1; i < lista.length; i++) {
            chave = lista[i];
            j = i - 1;

            while (j >= 0 && lista[j] > chave) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }

            lista[j + 1] = chave;
        }

        // Resultado

        System.out.println("Lista ordenada:");
        for (i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " , 1");
        }
    }
}