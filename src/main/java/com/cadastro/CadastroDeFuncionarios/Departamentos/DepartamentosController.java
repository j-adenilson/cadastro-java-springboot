package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentosController {

    private DepartamentosService departamentosService;

    public DepartamentosController(DepartamentosService departamentosService) {
        this.departamentosService = departamentosService;
    }

    @GetMapping("/departamento")
    public String homeDepartamento(){
        return "Olá do departamento";
    }


    //adicionar
    @PostMapping("/criar")
    public String criarDepartaento(){
        return "Departamento criado";
    }

    //listar todos
    @GetMapping("/listarDepartamentos")
    public List<DepartamentosModel>listarDepartamentos(){
        return departamentosService.listarDepartamentos();
    }

    //listar por id
    @GetMapping("/listarPorId/{id}")
    public DepartamentosModel listarPorId(@PathVariable Long id){
        return departamentosService.listarPorId(id);
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
