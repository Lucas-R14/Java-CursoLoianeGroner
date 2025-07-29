package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto: ");
        double valor1 = scan.nextDouble();

        System.out.println("Digite o valor do segundo produto: ");
        double valor2 = scan.nextDouble();

        System.out.println("Digite o valor do terceiro produto: ");
        double valor3 = scan.nextDouble();

        if (valor1 <= valor2 && valor1 <= valor3){
            System.out.println("Voce deve comprar o primeiro produto com o valor de " + valor1);
        } else if (valor2 <= valor1 && valor2 <= valor3){
            System.out.println("Voce deve comprar o segundo produto com o valor de " + valor2);
        } else {
            System.out.println("Voce deve comprar o terceiro produto com o valor de " + valor3);
        }
    }
}
