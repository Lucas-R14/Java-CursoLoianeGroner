package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada dos 3 números
        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scan.nextDouble();

        double maior, meio, menor;

        // Lógica de ordenação
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        // Saída
        System.out.println("Números em ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}
