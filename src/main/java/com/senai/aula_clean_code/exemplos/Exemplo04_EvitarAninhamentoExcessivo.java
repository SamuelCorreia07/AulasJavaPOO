package com.senai.aula_clean_code.exemplos;

public class Exemplo04_EvitarAninhamentoExcessivo {
    public boolean verificarPermissao(Usuario usuario) {
        if (usuario == null || !usuario.isAtivo()) {
            return false;
        }
        return usuario.getPerfil().equals("ADMIN");
    }
}
