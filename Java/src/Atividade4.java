// Busca Linear (ou Sequencial)

import java.util.Scanner;

public class Atividade4 {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int i, procurado;
        int[] lista = new int[3];

        // Inserir vetor

        for (i = 0; i < lista.length; i++) {
            System.out.print("Insira o número no array: ");
            lista[i] = leia.nextInt();
        }

        // Buscar numero

        for (i = 0; i < lista.length; i++) {
            System.out.println("Insira o número que quer buscar: ");
            procurado = leia.nextInt();

            if (procurado == lista[i]) {
                System.out.println("O valor procurado está na " + i + "ª posição.");
            } else {
                System.out.println(" Não existe esse número na lista.");
            }
        }
    }
}
