package com.cadastro.CadastroDeFuncionarios.Departamentos;

import com.cadastro.CadastroDeFuncionarios.Funcionarios.FuncionariosModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "id_departamento")
    private Long id;

    @Column(name = "nome_departamento")
    private String departamento;

    @OneToMany(mappedBy = "departamentos")
    @JsonIgnore
    private List<FuncionariosModel> funcionarios;


}
