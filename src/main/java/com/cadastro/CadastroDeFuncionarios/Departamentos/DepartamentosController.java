package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class DepartamentosController {

    @GetMapping("/departamento")
    public String homeDepartamento(){
        return "Olá do departamento";
    }


    //adicionar
    @PostMapping("/criarDepartamento")
    public String criarDepartaento(){
        return "Departamento criado";
    }

    //mostrar todos
    @GetMapping("/todosDepartamentos")
    public String mostrarTodosOsDepartamentos(){
        return "Mostrar todos os Departamentos";
    }

    //mostrar por id
    @GetMapping("/todosDepartamentosID")
    public String mostrarDepartamentosPorId(){
        return "Mostrar Departamento Por ID";
    }


    //alterar dados
    @PutMapping("/alterarDepartamentosID")
    public String alterarDepartamentosPorId(){
        return "Alterar Departamento por ID";
    }

    //deletar
    @DeleteMapping("/deletarDepartamentosID")
    public String deletarDepartamentosPorId(){
        return "Departamento deletado por ID";
    }
}
