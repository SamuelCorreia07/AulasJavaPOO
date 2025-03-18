package com.senai.aula03_encapsulamento.exercicios.gerenciamento_funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Cadastrar um funcionário                     |
                    |       2- Exibir salário de um funcionário             |
                    |       3- Alterar salário de um funcionário            |
                    |       4- Sair                                         |
                    _________________________________________________________
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
        switch (opcao) {
            case 1:


                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        } while (opcao != 4);


    }
}
