package com.rodrigofujioka.javabasico.aula05;

public class EstruturasDeRepeticao {

    public static void main(String[] args) {

        int[] lista = {5, 4, 9, 10, 11, 12};

        boolean terminado = false;
        revista:
        while (!terminado) {
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
                if (lista[i] % 2 == 0) {
                    System.out.println("par");
                    break revista;
                }
                if (lista[i] % 2 != 0) {
                    System.out.println("impar");
                    continue revista;
                }
            }
        }


    }


}
