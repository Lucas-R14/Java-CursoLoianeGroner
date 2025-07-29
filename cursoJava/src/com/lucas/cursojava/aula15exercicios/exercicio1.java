package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.print("Insira o segundo valor: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            System.out.println("O valor 1 é maior que o valor 2.");
        } else System.out.println("O valor 2 é maior que o valor 1");
    }
}
