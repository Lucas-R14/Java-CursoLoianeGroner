package com.lucas.cursojava.aula17exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Insira o seu nome: ");
        nome = scan.nextLine();
        int nomeLenght = nome.length();

        while (nomeLenght < 3) {
            System.out.println("O nome tem menos de 3 caracteres, insira novamente: ");
            nome = scan.nextLine();
            nomeLenght = nome.length();
        }

        while (true) {
            System.out.print("Insira sua idade: ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Inseriu uma idade invalida! Insira uma idade maior que 0 e menor que 150.");
            }
        }

        while (true) {
            System.out.print("Insira seu salario: ");
            salario = scan.nextDouble();

            if (salario >= 0) {
                break;
            } else {
                System.out.println("Inseriu um salario invalido! Insira um salario maior que 0.");
            }
        }

        while (true) {
            System.out.print("Digite o sexo (M ou F): ");
            sexo = scan.nextLine().trim();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
                break;
            } else {
                System.out.println("Inseriu um Sexo invalido! POr favor insira somente 'M' ou 'F'.");
            }
        }

        while (true){
            System.out.println("Insira o Estado de Civil (S; C; V; D): ");
            estadoCivil = scan.nextLine().trim();

            if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
                break;
            } else {
                System.out.println("Inseriu um Estado de Civil invalido! Por favor insira somente 'S', 'C', 'V' ou 'D'. ");
            }
        }

    }
}
