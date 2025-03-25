package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_veiculo;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica");
    } // Método polimórfico

    public String getModelo() {
        return modelo;
    }
}
