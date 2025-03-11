package com.senai.aula04_heranca.exemplos.veiculos;

// Subclasse Carro herda de Veículo
public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    // Método específico para Carro
    void exibirDetalhes(){
        super.exibirdetalhes(); // Chama o método da superclasse
        System.out.println("Portas: " + portas);
    }
}
