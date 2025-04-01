package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.veiculo;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro(),20);
        testarVeiculo(new Moto(), 30);
    }
    private static void testarVeiculo (Veiculo veiculo, int incremento){
        veiculo.ligar();
        veiculo.acelerar(incremento);
    }
}
