package com.lucas.cursojava.aula17exercicios;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Insira a nota (0 a 10): ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Insira novamente (0 a 10): ");
            nota = scan.nextInt();
        }

        scan.close();
    }
}
