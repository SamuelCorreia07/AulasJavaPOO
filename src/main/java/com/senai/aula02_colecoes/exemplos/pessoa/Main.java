package com.senai.aula02_colecoes.exemplos.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Samuel",18);
        Pessoa pessoa2 = new Pessoa("Pedro", 17);
        Pessoa pessoa3 = new Pessoa("Victor", 20);

        Pessoa[] matrizPessoas = new Pessoa[3]; //matriz pessoas


        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa matrizPessoa : matrizPessoas) {
            System.out.println(matrizPessoa);
        }

        matrizPessoas[0].falar("Oi!!!");
        System.out.println(matrizPessoas[2].nome);

        ArrayList lista = new ArrayList(); //lista genérica

        lista.add(12);
        lista.add(true);
        lista.add("teste");
        lista.add(pessoa1);

        Pessoa pessoa4 = (Pessoa) lista.get(3); //pegando
        pessoa4.falar("teste");

        ArrayList<Pessoa> listaPessoas = new ArrayList(); //lista de pessoas
        listaPessoas.add(pessoa2);
        listaPessoas.add(new Pessoa("Ketlyn", 16));

        System.out.println("Tamanho da lista: " + listaPessoas.size());

        listar(listaPessoas);
        listaPessoas.remove(pessoa2);
        listar(listaPessoas);

        listaPessoas.set(0,pessoa1);
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3);
        listar(listaPessoas);

        System.out.println("\n-----teste-----");
        listaPessoas.forEach(System.out::println); //for each puxa a função sout pra mostrar todos os objetos da lista

        listaPessoas.add(pessoa2);

        System.out.println("\n-----lista-----");
        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(pessoa -> pessoa.idade>=18).collect(Collectors.toList()); //filtra listaPessoas e cria uma lista nova só com os objetos filtrados
        listaFiltrada.forEach(System.out::println);

        System.out.println("\n-----lista-----");
        List<Pessoa> listaFiltrada2 = listaPessoas.stream().filter(pessoa -> pessoa.idade>=20).toList(); //mesma coisa do anterior
        listaFiltrada2.forEach(System.out::println);

        System.out.println("\n-----lista-----");
        List<Pessoa> listaFiltrada3 = listaPessoas.stream().filter(pessoa -> pessoa.nome.toLowerCase().contains("pe")).toList(); //filtra pelas letras do nome da pessoa (toLowerCase -> pesquisa com letras minúsculas, independente se a pessoa tiver letra maiúscula)
        listaFiltrada3.forEach(System.out::println);

        //Criando uma pessoa com scanner
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as informações a seguir: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome, idade));
        listaPessoas.forEach(System.out::println);

    }

    public static void listar(ArrayList<Pessoa> lista){
        System.out.println("");
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }
}
