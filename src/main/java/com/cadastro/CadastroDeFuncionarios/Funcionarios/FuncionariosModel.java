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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @Column(name = "cargo")
    private String cargo;

    @ManyToOne
    @JoinColumn(name = "departamentos_id")
    private DepartamentosModel departamentos;


}
