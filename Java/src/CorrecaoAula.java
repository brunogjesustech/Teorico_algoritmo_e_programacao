import java.util.Scanner;

public class CorrecaoAula {

    static Scanner leia = new Scanner(System.in);

    static int opcao;

    // Função Calcular Área
    static void calculaArea() {

        int raio;
        double area;

        System.out.print("Informe o raio: ");
        raio = leia.nextInt();

        area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area + " cm²");
    }

    // Função Média
    static void calcularMedia() {

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
    }

    // Função Menor
    static void calcularMenor() {

        int[] numero = new int[10];
        int menor, posicao = 0;

        // Preenche o vetor
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Informe um número: ");
            numero[i] = leia.nextInt();
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

    public static void main(String[] args) {

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular Área");
            System.out.println("2 - Calcular Média");
            System.out.println("3 - Calcular Menor");
            System.out.println("0 - Sair");

            opcao = leia.nextInt();

            if (opcao == 1) {
                calculaArea();
            } else if (opcao == 2) {
                calcularMedia();
            } else if (opcao == 3) {
                calcularMenor();
            }

        } while (opcao != 0);
    }
}