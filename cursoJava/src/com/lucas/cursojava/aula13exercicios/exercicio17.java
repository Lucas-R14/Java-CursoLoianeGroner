package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double metros;

        System.out.print("Quantos metros quadrados serão pintados?: ");
        metros = scan.nextDouble();

        metros = metros * 1.1;
        double litros = metros / 6;

        //situação 1
        double latas = (int) Math.ceil(litros / 18);
        double precoLatas = latas * 80;
        System.out.printf("1. Apenas latas de 18L: \nLatas: %.2f \nPreço: %.2f \n", latas, precoLatas);

        //situação 2
        double galoes = (int) Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25;
        System.out.printf("1. Apenas galões de 3,6L: \nGalões: %.2f \nPreço: %.2f \n", galoes, precoGaloes);

        //situação 3
        double latasMistura = (int) (litros / 18);
        double restoLitros = litros - (latasMistura * 18);
        double galoesMistura = Math.ceil(restoLitros / 3.6);
        double precoMistura = (latasMistura * 80) + (galoesMistura * 25);
        System.out.printf("2. Misturas latas e galões: \nLatas: %.2f \nGalões: %.2f \nPreço: %.2f", latasMistura, galoesMistura, precoMistura);
    }
}
