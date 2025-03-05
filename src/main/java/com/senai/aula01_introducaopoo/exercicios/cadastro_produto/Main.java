package com.senai.aula01_introducaopoo.exercicios.cadastro_produto;


public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto ("Tapioca com ovo", 7.99f, 10);
        Produto produto2 = new Produto ("Pão com ovo", 4.99f, 15);

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();

        produto1.atualizarEstoque(15);
        produto2.atualizarEstoque(20);

        produto1.calcularValorEstoque();
        produto2.calcularValorEstoque();

        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
    }
}
