package com.senai.Aula01_IntroducaoPOO.Exemplo.Pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, float altura, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    public void falar(String frase) {
        System.out.println(nome +" falou: "+ frase);
    }

    public void comer (String alimento) {
        System.out.println(nome + " comeu: "+ alimento);
    }

    @Override
    public String toString() {
        return "O nome da pessoa é "+this.nome+", tem "+this.idade+" anos, tem "+this.altura+" de altura e mora no endereço "+this.endereco;
    }
}
