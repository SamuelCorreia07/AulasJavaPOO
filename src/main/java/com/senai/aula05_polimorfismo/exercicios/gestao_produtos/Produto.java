package com.senai.aula05_polimorfismo.exercicios.gestao_produtos;

import java.util.ArrayList;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private ArrayList<Double> impostos;

    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.impostos = new ArrayList<>();
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public ArrayList<Double> getImpostos() {
        return impostos;
    }

    public void calcularPrecoFinal(){
        System.out.println("Calculadora Genérica");
    }

    public void adicionarImposto(double imposto){
        impostos.add(imposto);
    }
}
