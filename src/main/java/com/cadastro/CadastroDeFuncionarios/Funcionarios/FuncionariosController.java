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
    public FuncionariosModel criarFuncionario(@RequestBody FuncionariosModel funcionario){
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
    @PutMapping("/alterarID")
    public String alterarFuncionarioPorId(){
        return "Alterar funcionario por ID";
    }

    //deletar
    @DeleteMapping("/deletarID")
    public String deletarFuncionarioPorId(){
        return "Funcionario deletado por ID";
    }


}
