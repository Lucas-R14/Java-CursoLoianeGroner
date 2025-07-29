package com.lucas.cursojava.aula17exercicios;

public class exercicio4 {
    public static void main(String[] args) {

        double paisA = 80000;
        double paisB = 200000;
        int anos;

        for (anos=0; paisA != paisB ; anos++) {
            paisA = paisA * 1.3;
            paisB = paisB * 1.15;
        }

        System.out.println("para o país A atingir o mesmo número de habitantes do país B, levará " + anos + " anos!");
    }
}
