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
    public DepartamentosDTO criarDepartamento(@RequestBody DepartamentosDTO departamentos){
        return departamentosService.criarDepartamento(departamentos);
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
    @PutMapping("/atualizar/{id}")
    public DepartamentosModel atualizarDepartamentosPorId(@PathVariable Long id, @RequestBody DepartamentosModel departamentosAtualizado){
        return departamentosService.atualizarDepartamentosPorId(id, departamentosAtualizado);
    }

    //deletar
    @DeleteMapping("/deletar/{id}")
    public void deletarDepartamentosPorId(@PathVariable Long id){
        departamentosService.deletarDepartamentosPorId(id);
    }
}
