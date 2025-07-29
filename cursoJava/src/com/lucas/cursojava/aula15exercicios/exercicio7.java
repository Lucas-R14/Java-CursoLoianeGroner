package com.lucas.cursojava.aula15exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scan.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int numero3 = scan.nextInt();

        double maior = numero1;
        double menor = numero1;

        if (numero2 > maior){
            maior = numero2;
        }
        if (numero3 > maior){
            maior = numero3;
        }

        if (numero2 < menor){
            menor = numero2;
        }
        if (numero3 < menor){
            menor = numero3;
        }

        System.out.println("O maior valor é o número "+ maior);
        System.out.println("O menor valor é o número "+ menor);
    }
}
