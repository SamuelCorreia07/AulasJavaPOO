package com.senai.aula04_heranca.exemplos.veiculos;

// Subclasse Moto herda de Veículo
public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, int ano, boolean partidaEletrica) {
        super(marca, ano);
        this.partidaEletrica = partidaEletrica;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    // Método específico para Moto
    void exibirdetalhes() {
        super.exibirdetalhes();
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }
}
