package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.animal;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo: Au au!");
    }
}
