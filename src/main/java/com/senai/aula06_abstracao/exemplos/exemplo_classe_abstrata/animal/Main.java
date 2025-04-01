package com.senai.aula06_abstracao.exemplos.exemplo_classe_abstrata.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> listaDeAnimal = new ArrayList<>();

        listaDeAnimal.add(new Cachorro("Toby"));
        listaDeAnimal.add(new Gato("Flash"));

        listaDeAnimal.forEach(animal -> {
            animal.fazerSom();
            animal.dormir();
        });
    }
}
