package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        float valorHora;
        float horas;
        float salario;

        System.out.print("insira quanto você ganha a hora: ");
        valorHora = scan.nextFloat();

        System.out.print("Quantas horas você trabalhou neste mês?: ");
        horas = scan.nextFloat();

        salario = valorHora * horas;

        System.out.print("Você ganhou " + salario + " neste mês.");

        scan.close();
    }
}
