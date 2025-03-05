package com.senai.aula02_colecoes.exercicios.tarefa;

public class Tarefa {
    String nome;
    boolean status = false;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public void tarefaConcluida() {
        status = true;
        System.out.println("Tarefa '" + nome + "' marcada como concluída!");
    }

    @Override
    public String toString() {
        return nome + " - [" + (status ? "Concluída" : "Pendente") + "]";
    }
}
