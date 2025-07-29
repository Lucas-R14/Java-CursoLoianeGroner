package com.lucas.cursojava.aula13exercicios;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioBruto;
        double salarioLiq;
        double INSS;
        double sindicato;
        double IR;

        System.out.print("Digire o seu salario bruto: ");
        salarioBruto = scan.nextDouble();

        INSS = salarioBruto * 0.08;
        IR = salarioBruto * 0.11;
        sindicato = salarioBruto * 0.05;
        salarioLiq = salarioBruto - INSS - IR - sindicato;

        System.out.printf("\n--Descontos no salário-- \nSeu salario Bruto é de %.2f  \nImposto de Renda: %.2f \nINSS: %.2f \nSindicato: %.2f \nSalário Liquido: %.2f", salarioBruto, IR, INSS, sindicato, salarioLiq);
    }
}
