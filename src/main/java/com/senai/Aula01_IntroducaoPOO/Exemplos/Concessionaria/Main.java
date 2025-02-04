package com.senai.Aula01_IntroducaoPOO.Exemplos.Concessionaria;



public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Chevrolet",
                "Corsa",
                "prata",
                2008,
                23000.00
        );

        Carro carro2 = new Carro(
                "Volkswagen",
                "Voyage",
                "cinza",
                2010,
                25000
        );

        System.out.println(carro1);
        System.out.println(carro2);

        carro1.testDrive();
        carro1.comprar("Samuel");
        carro2.testDrive();
        carro2.comprar("Samuel");

        carro1.desvalorizacao(2025);
        carro2.desvalorizacao(2025);


    }
}
