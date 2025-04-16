package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.sistema_pagamentos;

public class PIX extends MetodoPagamento{
    private String idBiometria;

    public PIX(String nomeUsuario, double valorTransacao, String idTransacao, String dataTransacao, String idBiometria) {
        super(nomeUsuario, valorTransacao, idTransacao, dataTransacao);
        this.idBiometria = idBiometria;
    }

    public String getIdBiometria() {
        return idBiometria;
    }

    public void setIdBiometria(String idBiometria) {
        this.idBiometria = idBiometria;
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
