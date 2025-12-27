package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.stereotype.Component;

@Component
public class FuncionariosMapper {

    public FuncionariosModel map(FuncionariosDTO funcionariosDTO){

        FuncionariosModel funcionariosModel = new FuncionariosModel();

        funcionariosModel.setId(funcionariosDTO.getId());
        funcionariosModel.setNome(funcionariosDTO.getNome());
        funcionariosModel.setEmail(funcionariosDTO.getEmail());
        funcionariosModel.setIdade(funcionariosDTO.getIdade());
        funcionariosModel.setImgUrl(funcionariosDTO.getImgUrl());
        funcionariosModel.setCargo(funcionariosDTO.getCargo());
        funcionariosModel.setDepartamentos(funcionariosDTO.getDepartamentos());

        return funcionariosModel;
    }

        public FuncionariosDTO map(FuncionariosModel funcionariosModel){

        FuncionariosDTO funcionariosDTO = new FuncionariosDTO();
        funcionariosDTO.setId(funcionariosModel.getId());
        funcionariosDTO.setNome(funcionariosModel.getNome());
        funcionariosDTO.setEmail(funcionariosModel.getEmail());
        funcionariosDTO.setIdade(funcionariosModel.getIdade());
        funcionariosDTO.setImgUrl(funcionariosModel.getImgUrl());
        funcionariosDTO.setCargo(funcionariosModel.getCargo());
        funcionariosDTO.setDepartamentos(funcionariosModel.getDepartamentos());

        return funcionariosDTO;
        }

}
