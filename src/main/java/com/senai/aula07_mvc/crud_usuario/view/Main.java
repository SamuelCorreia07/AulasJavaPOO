package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController operadorController = new OperadorController();
        SupervisorController supervisorController = new SupervisorController();

        String menu =
                """
                Menu
                    1 - Cadastrar usuário
                    2 - Deletar Usuário
                    3 - Atualizar usuário
                    4 - Exibir usuários
                    5 - Ligar máquina
                    6 - Demitir operador
                    7 - Sair
                """;
        int opcao;
        int escolhaTipo = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao != 7) {
            System.out.println(
                        """
                        Qual tipo de usuário?
                        1 - Operador
                        2 - Supervisor
                        """
                );
                escolhaTipo = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Preencha os dados a seguir:");
                    System.out.print("\nid: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\nnome: ");
                    String nome = scanner.nextLine();
                    if (escolhaTipo == 1) {
                        System.out.print("\nsetor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome,id,setor);
                        if (operadorController.cadastrarOperador(operador)) {
                            System.out.println("Cadastro efetuado com sucesso");
                        } else {
                            System.out.println("Cadastro não efeituado");
                        }
                    } else if (escolhaTipo == 2) {
                        System.out.print("\nárea: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if (supervisorController.cadastrarSupervisor(supervisor)) {
                            System.out.println("Cadastro efetuado com sucesso");
                        } else System.out.println("Cadastro não efeituado");
                    }
                    break;
                case 2:
                    System.out.println("Escolha um usuário para validar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhaTipo == 1) {
                        operadorController.deletarOperador(id);
                    } else if (escolhaTipo == 2) {
                        supervisorController.deletarSupervisor(id);
                    }

                    break;
                case 3:
                    if (escolhaTipo == 1) {
                        operadorController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2) {
                        supervisorController.listarSupervisores().forEach(System.out::println);
                    }

                    System.out.println("Escolha um usuário para validar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Atualize as seguintes informações: ");
                    System.out.print("\nNome: ");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1) {
                        System.out.print("\nSetor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome,id,setor);
                        if (operadorController.atualizarOperador(operador)) {
                            System.out.println("Atualização efetuada com sucesso");
                        } else System.out.println("Atualização não efeituado");
                    } else if (escolhaTipo==2) {
                        System.out.println("\nÁrea: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome,id,area);
                        if (supervisorController.atualizarSupervisor(supervisor)) {
                            System.out.println("Atualização efetuada com sucesso");
                        } else System.out.println("Atualização não efeituado");
                    }

                    break;
                case 4:
                    if (escolhaTipo == 1) {
                        operadorController.listarOperadores().forEach(System.out::println);
                    } else if (escolhaTipo == 2) {
                        supervisorController.listarSupervisores().forEach(System.out::println);
                    }

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do sistema");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 7);
    }
}
