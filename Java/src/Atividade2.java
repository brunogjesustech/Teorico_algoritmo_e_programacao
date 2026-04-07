// Criar um fluxograma e pseudocódigo para resolver o problema de calcular a área de um círculo, dado o diâmetro = 20 cm.

import java.util.Scanner;

public class Atividade2 {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Variáveis

        double area, diametro, raio, circunferencia;

        // Recebendo dados

        System.out.println("------------------------------");
        System.out.println("Calculadora de área e circunferência");
        System.out.println("------------------------------");
        System.out.print("Insira o diâmetro do círculo: ");
        diametro = leia.nextDouble();

        // Definições

        raio = diametro / 2;

        // Cálculo - 𝐴=𝜋𝑟2 & 𝐶=𝑑𝜋

        area = Math.PI * Math.pow(raio, 2);
        circunferencia = diametro * Math.PI;

        // Resultado

        System.out.println("------------------------------");
        System.out.println("Calculadora de área e circunferência");
        System.out.println("------------------------------");
        System.out.println("A área do círculo é: " + area);
        System.out.println("------------------------------");
        System.out.println("A circunferência do círculo é: " + circunferencia);
        System.out.println("------------------------------");
    }
}
