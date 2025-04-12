package com.senai.aula04_heranca.exercicios.controle_estoque;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, int qtd, LocalDate dataValidade) {
        super(nome, preco, qtd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        this.dataValidade = dataValidade.format(formatter);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void exibirDetalhesAlimento() {
        System.out.printf("""
                        Produto:
                        Nome: %s
                        Preço: %.2f
                        Quantidade: %d
                        Data de Validade: %s
                        """,
                getNome(), getPreco(), getQtd(), dataValidade);
    }
}
