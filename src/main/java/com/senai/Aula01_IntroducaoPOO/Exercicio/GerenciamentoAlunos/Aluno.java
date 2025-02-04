package com.senai.Aula01_IntroducaoPOO.Exercicio.GerenciamentoAlunos;

public class Aluno {
    String nome;
    int idade;
    float nota;

    public Aluno(String nome, int idade, float nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do Aluno: " + nome +
                "\nIdade: " + idade +
                "\nNota: " + nota);
    }
    public void atualizarNota(float notaAtualizada){
        nota = notaAtualizada;
        System.out.println("Nota do aluno " + nome + " atualizada com sucesso para " + nota);
    }
    public boolean verificarAprovacao(){
        return nota >= 6;
    }

}
