package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarFuncionario(@RequestBody FuncionariosDTO funcionario){

        FuncionariosDTO funcionariosDTO = funcionariosService.criarFuncionario(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Funcionario criado com sucesso: " + funcionariosDTO.getNome() + " (ID): " + funcionariosDTO.getId());
    }

    //listar todos
    @GetMapping("/listarFuncionarios")
    public List<FuncionariosDTO> listarFuncionarios(){
        return funcionariosService.listarFuncionarios();
    }

    //listar por id
    @GetMapping("/listarPorId/{id}")
    public FuncionariosDTO listarPorId(@PathVariable Long id){
        return funcionariosService.listarPorId(id);
    }


    //alterar dados
    @PutMapping("/atualizar/{id}")
    public FuncionariosDTO atualizarFuncionarioPorId(@PathVariable Long id, @RequestBody FuncionariosDTO funcionariosAtualizado){
        return funcionariosService.atualizarFuncionarioPorId(id, funcionariosAtualizado);
    }

    //deletar
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarFuncionarioPorId(@PathVariable Long id){

        if (funcionariosService.listarPorId(id) != null){
            funcionariosService.deletarFuncionarioPorId(id);
        return ResponseEntity.ok("Funcionario com ID " + id + " deletado com sucesso");

        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O funcionario com ID: " + id + " não foi encontrado");
        }
    }


}
