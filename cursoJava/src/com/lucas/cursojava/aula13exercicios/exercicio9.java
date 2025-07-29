package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        float temperaturaF;
        float temperaturaC;

        System.out.print("Indique a temperatura em Farenheit: ");
        temperaturaF = scan.nextFloat();

        temperaturaC = (temperaturaF -32) * 5/9;

        System.out.print("A temperatura " + temperaturaF + "ºF é de " + temperaturaC + "ºC");

        scan.close();
    }
}
