package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.sistema_pagamentos;

import java.util.Random;

public class CarteiraDigital extends MetodoPagamento {
    private String senhaCarteira;
    private String codAutenticacaoDoisFatores;

    public CarteiraDigital(String nomeUsuario, double valorTransacao, String idTransacao, String dataTransacao, String senhaCarteira) {
        super(nomeUsuario, valorTransacao, idTransacao, dataTransacao);
        this.senhaCarteira = senhaCarteira;
        this.codAutenticacaoDoisFatores = null;
    }

    public String getSenhaCarteira() {
        return senhaCarteira;
    }

    public void setSenhaCarteira(String senhaCarteira) {
        this.senhaCarteira = senhaCarteira;
    }

    public void gerarCodAutenticacaoDoisFatores() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            char caractereSorteado = caracteres.charAt(indiceAleatorio);
            codigo.append(caractereSorteado);
        }

        codAutenticacaoDoisFatores = codigo.toString();
        System.out.println("Código de autenticação de dois fatores: " + codAutenticacaoDoisFatores);
    }

    @Override
    public void autenticacarUsuario(MetodoPagamento metodoPagamento) {

    }

    @Override
    public void validarAntifraude() {

    }

    @Override
    public void registroTransacao() {

    }
}
