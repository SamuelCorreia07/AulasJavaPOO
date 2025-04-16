package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.sistema_pagamentos;

abstract public class MetodoPagamento {
    protected String nomeUsuario;
    protected double valorTransacao;
    protected String idTransacao;
    protected String dataTransacao;

    public MetodoPagamento(String nomeUsuario, double valorTransacao, String idTransacao, String dataTransacao) {
        this.nomeUsuario = nomeUsuario;
        this.valorTransacao = valorTransacao;
        this.idTransacao = idTransacao;
        this.dataTransacao = dataTransacao;
    }

    abstract public void autenticacarUsuario(MetodoPagamento metodoPagamento);

    abstract public void validarAntifraude();

    abstract public void registroTransacao();

    public void registrarLog(){
        System.out.println("Transação registrada");
    }

    public void validarSeguranca(){
        System.out.println("Dispositivo confiável.");
        System.out.println("Dados confiáveis");
    }
}
