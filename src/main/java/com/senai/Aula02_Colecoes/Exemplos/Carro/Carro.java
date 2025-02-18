package com.senai.Aula02_Colecoes.Exemplos.Carro;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int ano;
    double valor;

    public Carro(String fabricante, String modelo, String cor, int ano, double valor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    public void testDrive(){
        System.out.println("Vruuuuum!!! " + modelo + " a todo vapor!");
    }
    public void comprar(String nomeCliente){
        System.out.println("Parabéns, " + nomeCliente + "! Você acabou de adquirir o " + modelo);
    }
    public void desvalorizacao(int anoAtual) {
        double valorAtual = valor;
        for (int i = 0; i < anoAtual-ano; i++) {
            valorAtual -= valor*0.02;
        }
        System.out.println("O modelo " + modelo + " com a desvalorização de 2% ao ano ficará R$" + String.format("%,3.2f", valorAtual)); //mostrar o valor atual com a desvalorização, mostrando apenas 2 casas decimais com o string.format
    }

    @Override
    public String toString() {
        return "Carro: " +
                "\n\tFabricante: " + fabricante +
                "\n\tModelo: " + modelo +
                "\n\tCor: " + cor +
                "\n\tAno: " + ano +
                "\n\tValor: R$" + valor;
    }
}
