package com.senai.aula04_heranca.exercicios.sistema_gestao_pedidos;

public class PedidoPresencial extends Pedido{
    private double desconto;

    public PedidoPresencial(int idPedido, double valorTotal, double desconto) {
        super(idPedido, valorTotal);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
