package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {

    private DepartamentosService departamentosService;

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
//    @GetMapping("/listarDepartamentos")
//    public String listarDepartamentos(){
//        return departamentosService.listarDepartamentos();
//    }

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
