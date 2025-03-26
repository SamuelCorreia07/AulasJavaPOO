package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

public class ReservaSimples extends Reserva{
    public ReservaSimples(String nomeCliente, int numDiarias, double tarifaDiaria) {
        super(nomeCliente, numDiarias, tarifaDiaria);
    }

    @Override
    public void calcularCustoTotal() {
        System.out.printf(
            """
            %s, aqui está o custo total da sua Reserva Simples:
            Número de diárias: %d, Tarifa diária: R$%.2f
            Custo total: R$%.2f
            
            """,
            getNomeCliente(), getNumDiarias(), getTarifaDiaria(), getNumDiarias()*getTarifaDiaria()
        );
    }
}
