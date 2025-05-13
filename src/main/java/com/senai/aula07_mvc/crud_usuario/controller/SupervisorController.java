package com.senai.aula07_mvc.crud_usuario.controller;

import com.senai.aula07_mvc.crud_usuario.model.Supervisor;
import com.senai.aula07_mvc.crud_usuario.model.SupervisorDAO;

import java.util.List;

public class SupervisorController {
    private SupervisorDAO supervisorDAO = new SupervisorDAO();

    public boolean cadastrarSupervisor(Supervisor supervisor) {
        if (supervisor != null) {
            supervisorDAO.salvar(supervisor);
            return true;
        } else return false;
    }

    public List<Supervisor> listarSupervisores(){
        return supervisorDAO.listar();
    }

    public boolean atualizarSupervisor(Supervisor supervisor) {
        if (supervisor != null) {
            supervisorDAO.atualizar(supervisor);
            return true;
        } else return false;
    }

    public boolean deletarSupervisor(int id) {
        if (id >= 0) {
            supervisorDAO.deletar(id);
            return true;
        } else return false;
    }
}
