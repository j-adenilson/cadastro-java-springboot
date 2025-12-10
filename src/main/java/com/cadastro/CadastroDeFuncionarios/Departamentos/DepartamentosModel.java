package com.cadastro.CadastroDeFuncionarios.Departamentos;

import com.cadastro.CadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_departamentos")
public class DepartamentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String departamento;

    @OneToMany(mappedBy = "departamentos")
    private List<FuncionariosModel> funcionarios;

    public DepartamentosModel() {
    }

    public DepartamentosModel(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
