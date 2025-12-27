package com.cadastro.CadastroDeFuncionarios.Departamentos;

import com.cadastro.CadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentosDTO {

    private Long id;

    private String departamento;

    private List<FuncionariosModel> funcionarios;


}
