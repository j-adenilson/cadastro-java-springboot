package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.stereotype.Component;

@Component
public class DepartamentosMapper {

    public DepartamentosModel map(DepartamentosDTO departamentosDTO){

        DepartamentosModel departamentosModel = new DepartamentosModel();

        departamentosModel.setId(departamentosDTO.getId());
        departamentosModel.setDepartamento(departamentosDTO.getDepartamento());
        departamentosModel.setFuncionarios(departamentosDTO.getFuncionarios());

        return departamentosModel;
    }

    public DepartamentosDTO map(DepartamentosModel departamentosModel){
        DepartamentosDTO departamentosDTO = new DepartamentosDTO();

        departamentosDTO.setId(departamentosModel.getId());
        departamentosDTO.setDepartamento(departamentosModel.getDepartamento());
        departamentosDTO.setFuncionarios(departamentosModel.getFuncionarios());

        return departamentosDTO;
    }
}
