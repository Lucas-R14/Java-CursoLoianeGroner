package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double metros;
        double litros;
        double latas;
        double preco;

        System.out.print("Quantos metros quadrados serão pintados?: ");
        metros = scan.nextDouble();

        litros = metros / 3;
        latas = (int) Math.ceil(litros / 18);
        preco = latas * 80;

        System.out.printf("--TOTAL-- \nLitros de tinta necessários: %.2f \nLatas: %.0f \nPreço total: %.2f$", litros, latas, preco);
    }
}
