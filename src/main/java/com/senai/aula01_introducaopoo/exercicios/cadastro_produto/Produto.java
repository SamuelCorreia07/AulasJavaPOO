package com.senai.aula01_introducaopoo.exercicios.cadastro_produto;

public class Produto {
    String nome;
    float preco;
    int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes () {
        System.out.println("Nome do produto: " + nome +"\nPreço: " + preco + "\nQuantidade: " + quantidade);
    }

    public void atualizarEstoque (int quantidadeNova) {
        quantidade = quantidadeNova;
        System.out.println("Estoque atualizado com sucesso!");
    }

    public void calcularValorEstoque () {
        System.out.println("O valor total em reais do estoque desse produto é de R$" + preco*quantidade);
    }
}
