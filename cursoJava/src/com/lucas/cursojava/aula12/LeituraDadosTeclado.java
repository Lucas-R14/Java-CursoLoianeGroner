package com.lucas.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("\n\nDigite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("\n\nDigite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade: " + idade);

        System.out.println("\n\nDigite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura: " + altura);

        // pra evitar o warning de scan leak:
        scan.close();
    }    
}
