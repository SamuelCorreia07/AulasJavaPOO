package com.senai.aula04_heranca.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet Celta", 2008, 4);
        Moto moto = new Moto("Suzuki V-STROM 1050", 2020, true);

        carro.exibirdetalhes();
        moto.exibirdetalhes();
    }
}
