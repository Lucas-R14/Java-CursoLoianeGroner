package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sexo;
        double altura;
        double pesoIdeal;

        System.out.print("Insira a sua altura (exemplo: 1,60): ");
        altura = scan.nextDouble();

        System.out.print("Insira seu sexo(masculino/feminino): ");
        sexo = scan.next();

        switch (sexo) {
            case "masculino":
                pesoIdeal = (72.2*altura) -58;
                System.out.printf("seu peso ideal é de: %.2f", pesoIdeal);
                break;
            case "feminino":
                pesoIdeal = (62.1*altura) -44.7;
                System.out.printf("seu peso ideal é de: %.2f", pesoIdeal);
                break;
        }
    }
}
