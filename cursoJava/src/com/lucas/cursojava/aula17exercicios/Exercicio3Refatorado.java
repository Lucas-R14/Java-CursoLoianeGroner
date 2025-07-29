package com.lucas.cursojava.aula17exercicios;

import java.util.Scanner;
public class Exercicio3Refatorado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = lerNome(scan);
        int idade = lerIdade(scan);
        double salario = lerSalario(scan);
        char sexo = lerSexo(scan);
        char estadoCivil = lerEstadoCivil(scan);

        System.out.println("\nDados inseridos:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scan.close();
    }

    private static String lerNome(Scanner scan) {
        String nome;
        do {
            System.out.print("Insira o seu nome: ");
            nome = scan.nextLine().trim();
            if (nome.length() < 3) {
                System.out.println("O nome deve ter pelo menos 3 caracteres.");
            }
        } while (nome.length() < 3);
        return nome;
    }

    private static int lerIdade(Scanner scan) {
        int idade;
        do {
            System.out.print("Insira a sua idade: ");
            while (!scan.hasNextInt()) {
                System.out.print("Idade inválida. Tente novamente: ");
                scan.next(); // descarta a entrada inválida
            }
            idade = scan.nextInt();
        } while (idade < 0 || idade > 150);
        scan.nextLine(); // consome o \n
        return idade;
    }

    private static double lerSalario(Scanner scan) {
        double salario;
        do {
            System.out.print("Insira o seu salário: ");
            while (!scan.hasNextDouble()) {
                System.out.print("Salário inválido. Tente novamente: ");
                scan.next();
            }
            salario = scan.nextDouble();
        } while (salario < 0);
        scan.nextLine(); // consome o \n
        return salario;
    }

    private static char lerSexo(Scanner scan) {
        String entrada;
        do {
            System.out.print("Digite o sexo (M ou F): ");
            entrada = scan.nextLine().trim();
        } while (entrada.length() != 1 ||
                !(entrada.equalsIgnoreCase("M") || entrada.equalsIgnoreCase("F")));
        return Character.toUpperCase(entrada.charAt(0));
    }

    private static char lerEstadoCivil(Scanner scan) {
        String entrada;
        do {
            System.out.print("Digite o estado civil (S, C, V, D): ");
            entrada = scan.nextLine().trim();
        } while (entrada.length() != 1 ||
                !(entrada.equalsIgnoreCase("S") || entrada.equalsIgnoreCase("C") ||
                        entrada.equalsIgnoreCase("V") || entrada.equalsIgnoreCase("D")));
        return Character.toUpperCase(entrada.charAt(0));
    }
}
