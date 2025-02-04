package com.senai.Aula01_IntroducaoPOO.Exemplos.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Daniel", 8);
        System.out.println(pessoa1);

        Scanner scanner = new Scanner(System.in);
        String[] cabecalho = {"Nome: ", "Idade: ", "Altura: ", "Endereço:\n\tRua: ", "\tNúmero: ", "\tBairro: ", "\tCidade: ","\tEstado: "}; //Informações para serem preenchidas
        String[] dados = new String[8]; //Array que recebe os dados e passa para o objeto

        System.out.println("Preencha as informações a seguir:");
        for (int i = 0; i < 8; i++) { //Estrutura de repetição para preencher o array dados
            System.out.print(cabecalho[i]);
            dados[i] = scanner.nextLine();
        }

        Pessoa pessoa2 = new Pessoa( //Preenchendo o objeto pessoa2 com as informções do array dados
                dados[0], //nome
                Integer.parseInt(dados[1]), //idade
                Float.parseFloat(dados[2]), //altura
                new Endereco(
                        dados[3], //rua
                        Integer.parseInt(dados[4]), //numero
                        dados[5], //bairro
                        dados[6], //cidade
                        dados[7])); //estado

        System.out.println(pessoa2); //Exibir detalhes da pessoa2

        pessoa1.comer("pão com ovo"); //nham nham
        pessoa2.comer("tapioca com ovo"); //delicious
    }
}
