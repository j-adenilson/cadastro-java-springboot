package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {

    @GetMapping("/departamento")
    public String homeDepartamento(){
        return "Olá do departamento";
    }


    //adicionar
    @PostMapping("/criar")
    public String criarDepartaento(){
        return "Departamento criado";
    }

    //mostrar todos
    @GetMapping("/todos")
    public String mostrarTodosOsDepartamentos(){
        return "Mostrar todos os Departamentos";
    }

    //mostrar por id
    @GetMapping("/todosID")
    public String mostrarDepartamentosPorId(){
        return "Mostrar Departamento Por ID";
    }


    //alterar dados
    @PutMapping("/alterarID")
    public String alterarDepartamentosPorId(){
        return "Alterar Departamento por ID";
    }

    //deletar
    @DeleteMapping("/deletarID")
    public String deletarDepartamentosPorId(){
        return "Departamento deletado por ID";
    }
}
