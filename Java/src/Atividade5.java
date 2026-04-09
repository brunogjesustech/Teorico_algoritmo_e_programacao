// Busca binária

import java.util.Scanner;

public class Atividade5 {
    static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Variáveis

        int inicio, meio, fim, procurado;
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        inicio = 0;
        fim = lista.length - 1;

        System.out.print("Insira o valor que deseja procurar: ");
        procurado = leia.nextInt();


        while (inicio <= fim) {
            meio = (inicio + fim) / 2;

            if (lista[meio] == procurado) {

                System.out.println("O valor procurado está na : " + meio + "ª posição");
                break;
            } else if (lista[meio] < procurado) {

                inicio = meio + 1;

            } else {

                fim = meio - 1;

            }
        }
    }
}
