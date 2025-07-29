package com.senai.aula_clean_code.depois_sistema_padronizado_check_in;

public class Passageiro {
    private String nome;
    private String cpf;
    private String tipoViagem;
    private int pesoBagagem;

    public Passageiro(String nome, String cpf, int pesoBagagem, String tipoViagem) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoViagem = tipoViagem;
        this.pesoBagagem = pesoBagagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(String tipoViagem) {
        this.tipoViagem = tipoViagem;
    }

    public int getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(int pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }
}
