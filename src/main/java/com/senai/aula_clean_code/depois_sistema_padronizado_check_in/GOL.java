package com.senai.aula_clean_code.depois_sistema_padronizado_check_in;

public class GOL implements CheckInFlySecure {
    private static final int QTD_CARACTERES_CPF = 14;

    @Override
    public void validarDocumento(String cpf) {
        if (cpf != null && cpf.length() == QTD_CARACTERES_CPF) {
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
        validarPesoBagagem(passageiro.getTipoViagem(), passageiro.getPesoBagagem());
        emitirCartaoEmbarque(passageiro.getNome());
        CheckInFlySecure.mensagemCheckIn();
    }
}
