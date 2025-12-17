package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    @GetMapping("/home")
    public String home(){
        return "Primeira mensagem na rota Home";
    }

    //adicionar
    @PostMapping("/criar")
    public String criarFuncionario(){
        return "Funcionario criado";
    }

    //mostrar todos
    @GetMapping("/todos")
    public String mostrarTodosOsFuncionarios(){
        return "Mostrar todos os funcionarios";
    }

    //mostrar por id
    @GetMapping("/todosID")
    public String mostrarFuncionariosPorId(){
        return "Mostrar funcionario Por ID";
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
