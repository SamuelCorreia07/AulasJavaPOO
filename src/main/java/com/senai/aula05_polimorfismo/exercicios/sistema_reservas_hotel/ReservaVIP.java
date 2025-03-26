package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class ReservaVIP extends Reserva{
    private double tarifaAdicional;

    public ReservaVIP(String nomeCliente, int numDiarias, double tarifaDiaria, double tarifaAdicional) {
        super(nomeCliente, numDiarias, tarifaDiaria);
        this.tarifaAdicional = tarifaAdicional;
    }

    public double getTarifaAdicional() {
        return tarifaAdicional;
    }

    @Override
    public void calcularCustoTotal() {
        System.out.printf(
            """
            %s, aqui está o custo total da sua Reserva VIP:
            Número de diárias: %d, Tarifa diária: R$%.2f, Tarifa Adicional na Diária: R$%.2f
            Custo total: R$%.2f
            
            """,
            getNomeCliente(), getNumDiarias(), getTarifaDiaria(), tarifaAdicional, getNumDiarias()*(getTarifaDiaria()+getTarifaAdicional())
        );
    }
}
