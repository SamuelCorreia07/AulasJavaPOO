package com.senai.aula03_encapsulamento.exercicios.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Feijão", -10);
        Produto produto2 = new Produto("Arroz", 20);

        System.out.println(produto1);
        System.out.println(produto2);

        produto1.setPreco(-10);

        produto1.setPreco(15);

        System.out.println(produto1);
    }
}
