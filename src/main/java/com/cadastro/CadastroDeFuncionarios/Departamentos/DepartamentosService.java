package com.cadastro.CadastroDeFuncionarios.Departamentos;

import java.util.List;

public class DepartamentosService {

    private DepartamentosRepository departamentosRepository;

    public DepartamentosService(DepartamentosRepository departamentosRepository) {
        this.departamentosRepository = departamentosRepository;
    }

    //listar departamentos
    public List<DepartamentosModel> listarDepartamentos(){
        return departamentosRepository.findAll();
    }

}
