package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        float temperaturaF;
        float temperaturaC;

        System.out.print("Indique a temperatura em Celsius: ");
        temperaturaC = scan.nextFloat();

        temperaturaF = (temperaturaC * 9/5) + 32;

        System.out.print("A temperatura " + temperaturaC + "ºC é de " + temperaturaF + "ºF");

        scan.close();
    }
}
