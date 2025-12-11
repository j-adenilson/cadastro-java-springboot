package com.cadastro.CadastroDeFuncionarios.Departamentos;

import com.cadastro.CadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_departamentos")
public class DepartamentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departamento;

    @OneToMany(mappedBy = "departamentos")
    private List<FuncionariosModel> funcionarios;


}
