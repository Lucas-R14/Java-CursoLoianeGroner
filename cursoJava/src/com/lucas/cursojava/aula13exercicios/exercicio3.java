package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        float valor1 = scan.nextFloat();

        System.out.print("Insira o segundo valor: ");
        float valor2 = scan.nextFloat();

        float media = valor1 + valor2;
        System.out.println("A soma dos dois valores é de: " + media);
        scan.close();
    }
}
