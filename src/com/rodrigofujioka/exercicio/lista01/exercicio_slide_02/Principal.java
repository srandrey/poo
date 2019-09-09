package com.rodrigofujioka.exercicio.lista01.exercicio_slide_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor A");
        int valorA = leitor.nextInt();

        System.out.println("Informa o valor B");
        int valorB = leitor.nextInt();
        calc.soma(valorA, valorB);

        leitor.close();
    }
}
