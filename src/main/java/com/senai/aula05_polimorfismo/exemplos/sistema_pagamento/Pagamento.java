package com.senai.aula05_polimorfismo.exemplos.sistema_pagamento;

public class Pagamento {
    private String nome;

    public Pagamento(String nome) {
        this.nome = nome;
    }

    public double calcularPagamento(){
        return 0.0; // método genérico, cada tipo de pagamento implementará o seu.
    }

    public String getNome() {
        return nome;
    }
}
