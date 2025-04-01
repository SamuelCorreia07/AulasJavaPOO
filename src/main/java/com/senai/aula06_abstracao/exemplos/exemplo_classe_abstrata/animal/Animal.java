package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.animal;

// Definição da classe abstrata
abstract public class Animal {
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método concreto (implementado)
    public void dormir(){
        System.out.println(nome + " está dormindo.");
    }

    //Método abstrato (deve ser implementado nas subclasses)
    abstract public void fazerSom();
}
