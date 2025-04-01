package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.veiculo;

abstract public class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("Acelerando para " + velocidade + " km/h.");
    }

    abstract public void ligar();
}
