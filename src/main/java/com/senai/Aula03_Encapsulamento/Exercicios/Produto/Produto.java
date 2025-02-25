package com.senai.Aula03_Encapsulamento.Exercicios.Produto;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {
        nome = null;
        preco = 0;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }
    }
}
