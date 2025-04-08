package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.sistema_pagamentos;

abstract public class MetodoPagamento {
    protected String nomeUsuario;
    protected double valorTransacao;

    public MetodoPagamento(String nomeUsuario, double valorTransacao) {
        this.nomeUsuario = nomeUsuario;
        this.valorTransacao = valorTransacao;
    }

    abstract public void validacaoAntifraude();

    abstract public void autenticacaoPagamento();



}
