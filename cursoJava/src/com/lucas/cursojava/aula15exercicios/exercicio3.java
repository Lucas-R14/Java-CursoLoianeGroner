package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduza o sexo (F/M): ");
        String sexo = scan.nextLine();

        if (sexo.equals("F")) {
            System.out.println("Feminino");
        } else if (sexo.equals("M")) {
            System.out.println("Masculino");
        } else System.out.println("Caracter inválido");
    }
}
