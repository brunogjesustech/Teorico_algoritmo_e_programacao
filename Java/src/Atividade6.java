// Bubble Sort (Ordenação por Bolha)

import java.util.Scanner;

public class Atividade6 {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int i, j, temp;

        // Arrays

        int[] lista = new int[5];

        for (i = 0; i < lista.length; i++) {

            System.out.print("Insira um número: ");
            lista[i] = leia.nextInt();
        }

        // Bubble Sort

        for (i = 0; i < lista.length - 1; i++) {
            for (j = 0; j < lista.length - 1 - i; j++) {

                if (lista[j] > lista[j + 1]) {
                    temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;

                }
            }
        }

        // Exibir resultado

        System.out.println("Lista ordenada: ");
        for (i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + ",");
        }
    }
}
