package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor = scan.nextInt();

        if (valor > 0){
            System.out.println("O valor é positivo");
        } else System.out.println("O valor é negativo");
    }
}
