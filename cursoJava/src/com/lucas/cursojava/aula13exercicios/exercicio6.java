package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args) {

        double raio;
        double area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o raio do circulo: ");
        raio = scan.nextFloat();

        area = Math.PI * (raio*raio);
        
        System.out.printf("a area do seu circulo é: %.2f", area);
        
        scan.close();
    }
}
