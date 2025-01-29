package com.senai.Aula01_IntroducaoPOO.Exercicio.CadastroProduto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Tapioca", 7.99f, 10);

        int opcao;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Exibir detalhes sobre o produto              |
                    |       2- Atualizar o estoque do produto               |
                    |       3- Calcular o valor do estoque                  |
                    |       4- Sair                                         |
                    _________________________________________________________
                    """;
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    produto1.exibirDetalhes();
                    break;
                case 2:
                    System.out.println("Coloque a quantidade atualizada do produto abaixo: ");
                    produto1.atualizarEstoque(scanner.nextInt());
                    break;
                case 3:
                    produto1.calcularValorEstoque();
                    break;
                case 4:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

    }
}
