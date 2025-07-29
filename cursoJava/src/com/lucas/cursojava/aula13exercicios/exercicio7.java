package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio7 {
    static public void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        float lado1;
        float lado2;
        float area;
        float areaDobro;

        System.out.print("Insira o primeiro lado do quadrado: ");
        lado1 = scan.nextFloat();

        System.out.print("Insira o segundo lado do quadrado: ");
        lado2 = scan.nextFloat();

        area = lado1 * lado2;
        areaDobro = area * 2;

        System.out.println("O valor da area do quadrado é: " + area);
        System.out.println("O valor do dobro da area do quadrado é: " + areaDobro);

        scan.close();
    }
}
