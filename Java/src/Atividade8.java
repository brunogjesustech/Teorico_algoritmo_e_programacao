// Refatoração de Sistema | Exercício Avançado: Sistema de Biblioteca | Sem funções

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String tituloUm, tituloDois;
        int estoqueUm, estoqueDois, opcao, qtd, livro;

        // Cadastro inicial

        System.out.print("Título do livro 1: ");
        tituloUm = leia.nextLine();

        System.out.print("Quantidade em estoque: ");
        estoqueUm = leia.nextInt();

        leia.nextLine();

        System.out.print("Título do livro 2: ");
        tituloDois = leia.nextLine();

        System.out.print("Quantidade em estoque: ");
        estoqueDois = leia.nextInt();

        // Menu

        do {
            System.out.println("1 - Empréstimo");
            System.out.println("2 - Devolução");
            System.out.println("3 - Relatório");
            System.out.println("0 - Sair");

            opcao = leia.nextInt();

            if (opcao == 1) {
                System.out.print("Livro (1 ou 2): ");
                livro = leia.nextInt();

                System.out.print("Quantidade: ");
                qtd = leia.nextInt();

                if (livro == 1) {
                    estoqueUm = estoqueUm - qtd;
                } else {
                    estoqueDois = estoqueDois - qtd;
                }

            } else if (opcao == 2) {
                System.out.print("Livro (1 ou 2): ");
                livro = leia.nextInt();

                System.out.print("Quantidade: ");
                qtd = leia.nextInt();

                if (livro == 1) {
                    estoqueUm = estoqueUm + qtd;
                } else {
                    estoqueDois = estoqueDois + qtd;
                }

            } else if (opcao == 3) {
                System.out.println("Livro 1: " + tituloUm + " - " + estoqueUm + " em estoque");
                System.out.println("Livro 2: " + tituloDois + " - " + estoqueDois + " em estoque");
            }
        } while (opcao != 0);
    }
}