package com.rodrigofujioka.javabasico.aula06;

public class Cerveja {

    private String nome;
    private int idade;
    private int anoVencimento;

    public Cerveja() {
    }

    public Cerveja(String nome, int idade, int anoVencimento) {
        this.nome = nome;
        this.idade = idade;
        this.anoVencimento = anoVencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoVencimento() {
        return anoVencimento;
    }

    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }
}
