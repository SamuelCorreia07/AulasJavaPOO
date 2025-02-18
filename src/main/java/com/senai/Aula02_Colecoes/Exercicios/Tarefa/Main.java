package com.senai.Aula02_Colecoes.Exercicios.Tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Tarefa> listaDeTarefas = new ArrayList<>(); //Criando a lista de tarefas
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String menu = """
                \n--- Gerenciador de Tarefas ---
                1. Adicionar Tarefa
                2. Listar Tarefas
                3. Marcar Tarefa como Concluída
                4. Remover Tarefa
                5. Sair
                """;
        int opcao;

        do {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    exibirTarefas();
                    break;
                case 3:
                    concluirTarefa();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    System.out.println("Até breve!!!\nPrograma Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 5);

    }

    public static void adicionarTarefa() {
        System.out.print("Digite o nome da tarefa: ");
        String nome = scanner.nextLine();
        listaDeTarefas.add(new Tarefa(nome));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void exibirTarefas(){
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println(i+1 + ". " + listaDeTarefas.get(i));
        }
    }

    public static void concluirTarefa() {
        System.out.println("Digite o número da tarefa para marcar como concluída: ");
        int idEscolhido = scanner.nextInt();
        listaDeTarefas.get(idEscolhido-1).tarefaConcluida();
    }

    public static void removerTarefa() {
        System.out.println("Digite o número da tarefa que deseja remover: ");
        int idEscolhido = scanner.nextInt();
        listaDeTarefas.remove(idEscolhido - 1);
    }
}
