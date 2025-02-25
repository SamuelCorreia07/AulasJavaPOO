package com.senai.Aula03_Encapsulamento.Exemplos.Carro;

// Definição da classe Carro
public class Carro {
    // Atributo privado: só pode ser acessado dentro da própria classe
    public int velocidade;

    //Construtor da classe
    public Carro() {
        velocidade = 0; // Icicilamente o carro está parado
    }

    //Método público para obter a velocidade (Getter)
    public int getVelocidade() {
        return velocidade;
    }

    //Método público para definir a velocidade (Setter)
    public void setVelocidade(int velocidade) {
        if (velocidade >=0) { // Regra de negócio: velocidade não pode ser negativa
            this.velocidade = velocidade;
        } else {
            System.out.println("Velocidade inválida!");
        }
    }
}
