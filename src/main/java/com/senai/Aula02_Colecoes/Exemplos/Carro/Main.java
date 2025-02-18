package com.senai.Aula02_Colecoes.Exemplos.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        System.out.println("Quantos carros deseja inserir no sistema: ");
        int qtdCarros = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Preencha as informações a seguir:");
        for (int i = 0; i < qtdCarros; i++) {
            System.out.println("Carro " + (i+1) + "\n");
            System.out.print("Fabricante: ");
            String fabricante = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Valor: ");
            double valorInicial = scanner.nextDouble();
            scanner.nextLine();

            listaDeCarros.add(new Carro(fabricante, modelo, cor, ano, valorInicial));
        }
        listaDeCarros.forEach(System.out::println);
    }
}
