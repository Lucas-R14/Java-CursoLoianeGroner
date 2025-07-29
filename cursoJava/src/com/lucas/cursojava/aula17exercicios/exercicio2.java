package com.lucas.cursojava.aula17exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome de usuário: ");
        String nome = scan.nextLine();

        System.out.println("Insira a sua senha: ");
        String senha = scan.nextLine();

        if (senha.equals(nome)){
            do {
                System.out.println("A senha nao pode ser igual ao nome! Insira uma senha diferente: ");
                senha = scan.nextLine();
            } while (senha.equals(nome));
        }
    }
}
