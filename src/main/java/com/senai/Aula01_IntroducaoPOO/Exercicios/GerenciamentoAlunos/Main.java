package com.senai.Aula01_IntroducaoPOO.Exercicios.GerenciamentoAlunos;

import java.util.Scanner;

public class Main {
    static Aluno aluno1 = new Aluno("",0,0), aluno2 = new Aluno ("",0,0), aluno3= new Aluno("",0,0);
    static Aluno[] alunos = {aluno1, aluno2, aluno3};
    static String[] cabecalho = {"Nome: ", "Idade: ", "Nota: "};
    static int qtdAlunos = 0, totalAlunos = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int opcao;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Cadastrar um aluno (máx. 3)                  |
                    |       2- Atualizar a nota de um alunos                |
                    |       3- Exibir informações dos alunos                |
                    |       4- Sair                                         |
                    _________________________________________________________
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (totalAlunos >= qtdAlunos){
                        cadastrarAluno();
                        qtdAlunos = qtdAlunos + 1;
                    } else {
                        System.out.println("Quantidade máxima de alunos atingida");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do aluno que deseja atualizar a nota: ");
                    String nomeAluno = scanner.nextLine();
                    boolean verificacao = false;

                    for (int i = 0; i < alunos.length; i++) {
                        if (alunos[i].nome.equals(nomeAluno)) {
                            verificacao = true;
                            break;
                        }
                    }

                    for (int i = 0; i < alunos.length; i++) {
                        if (verificacao) {
                            System.out.println("Digite a nota atualizada:");
                            float notaAtualizada = scanner.nextFloat();
                            alunos[i].atualizarNota(notaAtualizada);
                            break;
                        } else {
                            System.out.println("Nome inválido!");
                        }
                    }
                    break;
                case 3:
                    for (Aluno aluno : alunos) {
                        aluno.exibirInformacoes();
                    if (aluno.verificarAprovacao()) {
                        System.out.println("Aluno aprovado!");
                     } else {
                        System.out.println("Aluno reprovado!");
                        }
                     }
                    break;
                case 4:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

    }

    public static void cadastrarAluno() {

        System.out.println("Preencha os dados a seguir:");
        System.out.print(cabecalho[0]);
        alunos[qtdAlunos].nome = scanner.nextLine();
        System.out.print(cabecalho[1]);
        alunos[qtdAlunos].idade = scanner.nextInt();
        System.out.print(cabecalho[2]);
        alunos[qtdAlunos].nota = scanner.nextFloat();

    }

}
