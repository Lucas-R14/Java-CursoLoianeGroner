package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();
        System.out.println("O numero que você digitou é: " + numero);
        scan.close();
    }
}
