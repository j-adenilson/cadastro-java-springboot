package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionariosService {

    private FuncionariosRepository funcionariosRepository;

    public FuncionariosService(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    //listar todos os funcionarios
    public List<FuncionariosModel> listarFuncionarios(){
        return funcionariosRepository.findAll();
    }

}
