package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    private FuncionariosService funcionariosService;

    public FuncionariosController(FuncionariosService funcionariosService) {
        this.funcionariosService = funcionariosService;
    }

    @GetMapping("/home")
    public String home(){
        return "Primeira mensagem na rota Home";
    }

    //adicionar
    @PostMapping("/criar")
    public FuncionariosDTO criarFuncionario(@RequestBody FuncionariosDTO funcionario){
        return funcionariosService.criarFuncionario(funcionario);
    }

    //listar todos
    @GetMapping("/listarFuncionarios")
    public List<FuncionariosModel> listarFuncionarios(){
        return funcionariosService.listarFuncionarios();
    }

    //listar por id
    @GetMapping("/listarPorId/{id}")
    public FuncionariosModel listarPorId(@PathVariable Long id){
        return funcionariosService.listarPorId(id);
    }


    //alterar dados
    @PutMapping("/atualizar/{id}")
    public FuncionariosModel atualizarFuncionarioPorId(@PathVariable Long id, @RequestBody FuncionariosModel funcionariosAtualizado){
        return funcionariosService.atualizarFuncionarioPorId(id, funcionariosAtualizado);
    }

    //deletar
    @DeleteMapping("/deletar/{id}")
    public void deletarFuncionarioPorId(@PathVariable Long id){
        funcionariosService.deletarFuncionarioPorId(id);
    }


}
