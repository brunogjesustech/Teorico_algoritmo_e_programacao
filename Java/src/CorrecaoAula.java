// Crie 3 funções e depois um menu que inicialize elas

// 1 - Solicite ao usuário o raio e calcule a área do circulo
// 2 - Calcule a média de 6 números
// 3 - Crie um Vetor com 10 números e identifique em qual posição se encontra o menor número

import java.util.Scanner;

public class CorrecaoAula {

    static Scanner leia = new Scanner(System.in);

    static int opcao;

    // Função Calcular Área
    static void calculaArea() {

        System.out.println();

        int raio;
        double area;

        System.out.print("Informe o raio: ");
        raio = leia.nextInt();

        area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area + " cm²");
        System.out.println();
    }

    // Função Média
    static void calcularMedia() {

        System.out.println();

        int soma = 0;
        double media;

        int[] lista = new int[6];

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Informe um número: ");
            lista[i] = leia.nextInt();
            soma += lista[i];
        }

        media = (double) soma / lista.length;

        System.out.println("Média: " + media);
        System.out.println();
    }

    // Função Menor
    static void calcularMenor() {

        System.out.println();

        int[] numero = new int[10];
        int menor, posicao = 0;

        // Preenche o vetor
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Informe um número: ");
            numero[i] = leia.nextInt();
            System.out.println();
        }

        // Inicializa depois de preencher
        menor = numero[0];

        // Procura o menor
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
                posicao = i;
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Posição: " + posicao);
    }

    static void main(String[] args) {

        do {

            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Média");
            System.out.println("3 - Calcular Menor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leia.nextInt();

            if (opcao == 1) {
                calculaArea();
            } else if (opcao == 2) {
                calcularMedia();
            } else if (opcao == 3) {
                calcularMenor();
            }
            else {
                System.out.println("Obrigado por acessar nosso programa!");
            }

        } while (opcao != 0);
    }
}