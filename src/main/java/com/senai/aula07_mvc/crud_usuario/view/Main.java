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
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println(
                            """
                            Qual tipo de usuário?
                            1 - Operador
                            2 - Supervisor
                            """
                    );
                    int escolhaTipo = scanner.nextInt();
                    System.out.println("Preencha os dados a seguir:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    if (escolhaTipo == 1) {
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome,id,setor);
                        operadorController.cadastrarOperador(operador);
                    } else if (escolhaTipo == 2) {
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        supervisorController.cadastrarSupervisor(supervisor);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    operadorController.listarOperadores().stream().forEach(System.out::println);
                    supervisorController.listarSupervisores().stream().forEach(System.out::println);
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
                    System.out.println("Opção invãlida");
                    break;
            }
        } while (opcao != 7);
    }
}
