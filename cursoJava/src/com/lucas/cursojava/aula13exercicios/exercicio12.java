package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura;
        double pesoIdeal;

        System.out.print("Insira a sua altura (exemplo: 1,60): ");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.printf("Seu peso ideal é de: %.2fKg", pesoIdeal);
    }
}

