package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new ContaCorrente("Victor", 5000));
        testarContas(new ContaPoupanca("PedrinhoGameplays", 1500));
    }
    public static void testarContas(ContaBancaria contaBancaria) {
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }
}
