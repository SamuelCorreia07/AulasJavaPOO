package com.senai.Aula01_IntroducaoPOO.Exemplo.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Daniel", 8);

        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa(
                "Samuel",
                17,
                1.7f,
                new Endereco(
                        "Ametista",
                        511,
                        "Jardim Nicea",
                        "Itaquaquecetuba",
                        "SP"));

        System.out.println(pessoa2);

        pessoa1.comer("pão com ovo");
        pessoa2.comer("tapioca com ovo");
    }
}
