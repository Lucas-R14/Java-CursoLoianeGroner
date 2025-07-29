package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;

        System.out.print("Insira sua nota do primeiro bimestre: ");
        nota1 = scan.nextFloat();
        System.out.print("Insira sua nota do segundo bimestre: ");
        nota2 = scan.nextFloat();
        System.out.print("Insira sua nota do terceiro bimestre: ");
        nota3 = scan.nextFloat();
        System.out.print("Insira sua nota do quarto bimestre: ");
        nota4 = scan.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Sua média é de: " + media);
        scan.close();
    }
}
