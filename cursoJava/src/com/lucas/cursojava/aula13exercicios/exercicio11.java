package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        
        int valor1;
        int valor2;
        double valor3;

        System.out.print("Insira o valor 1(inteiro): ");
        valor1 = scan.nextInt();
        System.out.print("Insira o valor 2(inteiro): ");
        valor2 = scan.nextInt();
        System.out.print("Insira o valor 3(real): ");
        valor3 = scan.nextDouble();

        double resultadoA = (valor1 * 2) * (valor2/2);

        double resultadoB = (valor1*3) + valor3;

        double resultadoC = valor3 * valor3 * valor3;

        System.out.println("Resultado A (produto do dobro do valor 1 com metado do valor 2): " + resultadoA);
        System.out.println("Resultado B (a soma do triplo do valor 1 com o valor 3): " + resultadoB);
        System.out.println("Resultado C (valor 3 elevado ao cubo): " + resultadoC);
        
        scan.close();
    }
}
