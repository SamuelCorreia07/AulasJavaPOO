package com.senai.aula04_heranca.exercicios.controle_estoque;

public class Eletronico extends Produto {
    private int tensao;

    public Eletronico(String nome, double preco, int qtd, int tensao) {
        super(nome, preco, qtd);
        this.tensao = tensao;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public void exibirDetalhesEletronico() {
        System.out.printf("""
                        Produto:
                        Nome: %s
                        Preço: %.2f
                        Quantidade: %d
                        Tensão: %dV
                        """,
                getNome(), getPreco(), getQtd(), tensao);
    }
}
