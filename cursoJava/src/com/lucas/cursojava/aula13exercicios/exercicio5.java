package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        float metros;
        float centimetros;

        System.out.print("Insira um valor (metros): ");
        metros = scan.nextFloat();

        centimetros = metros * 100;

        System.out.println(metros + " em centrimetros: " + centimetros);

        scan.close();
    }
}
