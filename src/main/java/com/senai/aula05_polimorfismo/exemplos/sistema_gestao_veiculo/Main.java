package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_veiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("Toyota Corolla"));
        realizarManutencao(new Moto("Honda CB500"));
        realizarManutencao(new Caminhao("Volvo FH"));
    }
    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
