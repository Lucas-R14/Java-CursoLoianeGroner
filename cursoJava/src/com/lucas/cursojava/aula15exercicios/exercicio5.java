package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduza a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();

        System.out.println("Introduza a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("O aluno foi aprovado com Distinção!");
        }else if (media >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else if (media < 7) {
            System.out.println("O aluno foi reprovado!");
        }

    }
}
