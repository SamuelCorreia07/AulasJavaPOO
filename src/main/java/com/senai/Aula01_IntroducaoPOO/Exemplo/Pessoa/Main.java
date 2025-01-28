package com.senai.Aula01_IntroducaoPOO.Exemplo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Samuel", 17);

        System.out.println(pessoa1.nome+", "+ pessoa1.idade+", "+pessoa1.altura+", "+pessoa1.endereco);
    }
}
