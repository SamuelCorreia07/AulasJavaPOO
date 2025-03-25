package com.senai.aula05_polimorfismo.exercicios.sistema_relatorios;

public class Relatorio {
    private int tamanhoArquivo;

    public Relatorio(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void gerarRelatorio(){
        System.out.println("Relatório Genérico");
    }
}
