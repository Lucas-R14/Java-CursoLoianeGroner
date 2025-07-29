package com.lucas.cursojava.aula15exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a letra: ");
        char letra = scan.next().toUpperCase().charAt(0);

        System.out.println(letra);

        switch (letra) {
            case 'A':
                System.out.println("Vogal");
                break;
                case 'E':
                System.out.println("Vogal");
                break;
                case 'I':
                System.out.println("Vogal");
                break;
                case 'O':
                System.out.println("Vogal");
                break;
                case 'U':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;

        }
    }
}
