// Menu Biblioteca - Código Refatorado (Com Funções e Procedimentos)

import java.util.Scanner;

public class Atividade9 {

    static Scanner leia = new Scanner(System.in);

    // Variáveis

    static int estoque1, estoque2;
    static String titulo1, titulo2;

    // Função Cadastro

    public static void cadastrarLivros() {

        System.out.print("Título do livro 1: ");
        titulo1 = leia.nextLine();

        System.out.print("Quantidade em estoque: ");
        estoque1 = leia.nextInt();

        leia.nextLine();
        System.out.print("Título do livro 2: ");
        titulo2 = leia.nextLine();

        System.out.print("Quantidade em estoque: ");
        estoque2 = leia.nextInt();

        System.out.println();
    }

    // Função Empréstimo

    public static void emprestimo(int livro, int qntd) {

        if (livro == 1) {
            estoque1 = estoque1 - qntd;
        } else {
            estoque2 = estoque2 - qntd;
        }
    }

    // Função Devolução

    public static void devolucao(int livro, int qntd) {

        if (livro == 1) {
            estoque1 = estoque1 + qntd;
        } else {
            estoque2 = estoque2 + qntd;
        }

    }

    // Função Relatório

    public static void relatorio() {

        System.out.println("Livro 1: " + titulo1 + " - " + estoque1 + " em estoque");
        System.out.println("Livro 2: " + titulo2 + " - " + estoque2 + " em estoque");
        System.out.println();
    }

    // Aplicação

    static void main(String[] args) {

        // Variáveis

        int opcao, livro, qntd;

        cadastrarLivros();

        do {
            System.out.println("Insira um número para acessar nossos serviços:");
            System.out.println("1 - Empréstimo");
            System.out.println("2 - Devolução");
            System.out.println("3 - Relatório");
            System.out.println("0 - Sair");


            opcao = leia.nextInt();
            System.out.println();

            // Emprestimo

            if (opcao == 1) {
                System.out.print("Livro (1 ou 2): ");
                livro = leia.nextInt();

                System.out.print("Quantidade: ");
                qntd = leia.nextInt();
                System.out.println();

                emprestimo(livro, qntd);
            }

            // Devolução

            else if (opcao == 2) {

                System.out.print("Livro (1 ou 2): ");
                livro = leia.nextInt();

                System.out.print("Quantidade: ");
                qntd = leia.nextInt();
                System.out.println();

                devolucao(livro, qntd);
            }

            // Relatório

            else if (opcao == 3) {

                relatorio();
            }
        }
        while (opcao != 0);
    }
}
