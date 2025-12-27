package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarDepartamento(@RequestBody DepartamentosDTO departamentos){

        DepartamentosDTO departamentosDTO = departamentosService.criarDepartamento(departamentos);
        return  ResponseEntity.status(HttpStatus.CREATED)
                .body("Departamento criado com sucesso: " + departamentosDTO.getDepartamento() + " (ID): " + departamentosDTO.getId());
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
    public ResponseEntity<String> deletarDepartamentosPorId(@PathVariable Long id){

        if (departamentosService.listarPorId(id) != null){
            departamentosService.deletarDepartamentosPorId(id);
            return ResponseEntity.ok("Departamento com ID " + id + " deletado com sucesso");

        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O departamento com ID: " + id + " Não foi encontrado");
        }

    }
}
