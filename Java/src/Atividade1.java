//Resolver um problema simples usando lógica booleana. Exemplo: “Se um aluno tem mais de 18 anos e nota acima de 7, ele pode assistir à palestra.”

import java.util.Scanner;

public class Atividade1 {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        int idade;
        float nota;

        // Recebendo dados

        System.out.print("Insira sua idade: ");
        idade = leia.nextInt();

        System.out.print("Insira sua nota: ");
        nota = leia.nextFloat();

        // Validador

        if (idade > 18 || nota > 7){
            System.out.println("Você pode assistir a palestra.");
        }
        else {
            System.out.println("Você não pode assistir a palestra.");
        }
    }
}

