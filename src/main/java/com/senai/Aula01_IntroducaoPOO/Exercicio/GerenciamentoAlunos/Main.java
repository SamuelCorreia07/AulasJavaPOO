package com.senai.Aula01_IntroducaoPOO.Exercicio.GerenciamentoAlunos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "Samuel",
                18,
                7.5f);
        Aluno aluno2 = new Aluno(
                "Victor",
                20,
                9);
        Aluno aluno3 = new Aluno(
                "Nayara",
                19,
                5);

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();

        aluno1.atualizarNota(5.5f);
        aluno2.atualizarNota(9.5f);
        aluno3.atualizarNota(7.5f);

        if (aluno1.verificarAprovacao()) {
            System.out.println(aluno1.nome + " Aprovado!");
        } else {
            System.out.println(aluno1.nome + " Reprovado!");
        }

        if (aluno2.verificarAprovacao()) {
            System.out.println(aluno2.nome + " Aprovado!");
        } else {
            System.out.println(aluno2.nome + " Reprovado!");
        }

        if (aluno3.verificarAprovacao()) {
            System.out.println(aluno3.nome + " Aprovado!");
        } else {
            System.out.println(aluno3.nome + " Reprovado!");
        }

    }
}
