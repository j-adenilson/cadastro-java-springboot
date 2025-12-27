package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import com.cadastro.CadastroDeFuncionarios.Departamentos.DepartamentosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionariosDTO {

    private Long id;

    private String nome;

    private String email;

    private String imgUrl;

    private int idade;

    private String cargo;

    private DepartamentosModel departamentos;

}
