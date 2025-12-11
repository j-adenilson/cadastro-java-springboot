package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import com.cadastro.CadastroDeFuncionarios.Departamentos.DepartamentosModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_cadastro")
public class FuncionariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "departamentos_id")
    private DepartamentosModel departamentos;


}
