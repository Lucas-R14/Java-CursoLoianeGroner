package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso;
        double excesso = 0;
        double multa = 0;

        System.out.print("Digite o peso de peixes(em Kg): ");
        peso = scan.nextDouble();

        if (peso>50){
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.printf("O PESO FOI EXCEDIDO POR %.2f Kg, \nserá aplicada uma multa de %.2f$ (4,0$ por Kg)", excesso, multa);
        } else System.out.printf("nao excedeu o peso limite de 50Kg, \nPeso: %.2f \nExcesso: %.2f \nMulta: %.2f", peso, excesso, multa);
    }
}
