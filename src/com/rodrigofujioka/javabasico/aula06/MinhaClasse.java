package com.rodrigofujioka.javabasico.aula06;

public class MinhaClasse {

    private static int qtdObjetos = 8;
    private int meuNumero;

    public MinhaClasse() {
        qtdObjetos++;
        meuNumero = qtdObjetos;
    }

    public int getMeuNumero() {
        return this.meuNumero;
    }

}
