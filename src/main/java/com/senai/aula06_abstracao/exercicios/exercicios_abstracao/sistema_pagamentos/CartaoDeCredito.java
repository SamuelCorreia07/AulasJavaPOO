package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.sistema_pagamentos;

public class CartaoDeCredito extends MetodoPagamento{
    private int senhaCartao;

    public CartaoDeCredito(String nomeUsuario, double valorTransacao, String idTransacao, String dataTransacao, int senhaCartao) {
        super(nomeUsuario, valorTransacao, idTransacao, dataTransacao);
        this.senhaCartao = senhaCartao;
    }

    public int getSenhaCartao() {
        return senhaCartao;
    }

    public void setSenhaCartao(int senhaCartao) {
        this.senhaCartao = senhaCartao;
    }

    @Override
    public void autenticacarUsuario(MetodoPagamento metodoPagamento) {
        System.out.println("Usuário " + metodoPagamento.nomeUsuario + " autenticado com sucesso!");
    }

    @Override
    public void validarAntifraude() {

    }

    @Override
    public void registroTransacao() {

    }
}
