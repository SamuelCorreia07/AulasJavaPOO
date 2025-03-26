package com.senai.aula05_polimorfismo.exercicios.gestao_produtos;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(String nomeProduto, double precoProduto) {
        super(nomeProduto, precoProduto);
        adicionarImposto(0.05); // ISS 5%
    }

    @Override
    public void calcularPrecoFinal() {

    }
}
