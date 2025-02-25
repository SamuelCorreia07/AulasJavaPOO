package com.senai.Aula03_Encapsulamento.Exercicios.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Cabraleso");
        produto1.setPreco(-10.49);

        System.out.println("Nome produto: " + produto1.getNome() + "\nPreço produto: " + produto1.getPreco());
    }
}
