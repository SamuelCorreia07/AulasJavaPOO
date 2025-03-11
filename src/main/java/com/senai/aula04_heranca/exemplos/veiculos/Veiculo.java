package com.senai.aula04_heranca.exemplos.veiculos;

// Classe base (Superclasse)
public class Veiculo {
    private String marca;
    private int ano;

    // Construtor
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método comum a todos os veículos
    void exibirdetalhes() {
        System.out.print("Marca: " + marca + ", Ano: " + ano);
    }
}
