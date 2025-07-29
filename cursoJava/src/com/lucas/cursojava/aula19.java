package com.lucas.cursojava;

import java.util.Scanner;

public class aula19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);

        System.out.println("O tamanho do array: " + temperaturas.length);


    }
}
