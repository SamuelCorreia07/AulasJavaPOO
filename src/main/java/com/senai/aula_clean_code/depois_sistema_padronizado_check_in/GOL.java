package com.senai.aula_clean_code.depois_sistema_padronizado_check_in;

public class GOL implements CheckInFlySecure {

    @Override
    public void validarDocumento(String cpf) {
        if (cpf != null && cpf.length() == 14) {
            System.out.println("Documento válido.");
        } else {
            System.out.println("Documento inválido.");
        }
    }

    @Override
    public void emitirCartaoEmbarque(String nome) {
        System.out.println("Cartão de embarque GOL de " + nome + " emitido com sucesso!");
    }

    @Override
    public void realizarCheckIn(Passageiro passageiro) {
        CheckInFlySecure.mensagemBoasVindas();

        validarDocumento(passageiro.getCpf());
        mensagemDadosValidados(passageiro.getNome());
        if (passageiro.getTipoViagem() == 1) {
            validarPesoBagagemNacional(passageiro.getPesoBagagem());
            emitirCartaoEmbarque(passageiro.getNome());
            CheckInFlySecure.mensagemCheckIn();
        } else if (passageiro.getTipoViagem() == 2) {
            validarPesoBagagemInternacional(passageiro.getPesoBagagem());
        } else {
            System.out.println("Tipo de viagem inválido! Check-in cancelado.");
        }
    }
}
