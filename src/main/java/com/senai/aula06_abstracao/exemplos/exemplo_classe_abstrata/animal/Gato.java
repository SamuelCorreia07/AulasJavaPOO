package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.animal;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está miando: Miau!");
    }
}
