package com.senai.aula05_polimorfismo.exemplos.sistema_gestao_veiculo;

public class Moto extends Veiculo{
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção preventiva realizada para o carro " + getModelo());
    }
}
