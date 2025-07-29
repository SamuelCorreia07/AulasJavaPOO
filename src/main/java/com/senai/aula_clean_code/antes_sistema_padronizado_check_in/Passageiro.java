package com.senai.aula_clean_code.antes_sistema_padronizado_check_in;

public class Passageiro {
    private String nome;
    private String cpf;
    private int tipoViagem;
    private int pesoBagagem;

    public Passageiro(String nome, String cpf, int pesoBagagem, int tipoViagem) {
        this.nome = nome;
        this.cpf = cpf;
        if (tipoViagem == 1 || tipoViagem == 2) {
            this.tipoViagem = tipoViagem;
        } else this.tipoViagem = 0;
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

    public int getTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(int tipoViagem) {
        this.tipoViagem = tipoViagem;
    }

    public int getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(int pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }
}
