package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionariosService {

    private FuncionariosRepository funcionariosRepository;

    public FuncionariosService(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    //criar funcionario
    public FuncionariosModel criarFuncionario(FuncionariosModel funcionarios){
        return funcionariosRepository.save(funcionarios);
    }

    //listar todos os funcionarios
    public List<FuncionariosModel> listarFuncionarios(){
        return funcionariosRepository.findAll();
    }

    //listar por ID
    public FuncionariosModel listarPorId(Long id){
        Optional<FuncionariosModel> funcionarioPorId = funcionariosRepository.findById(id);
        return funcionarioPorId.orElse(null);
    }

    //altualizar funcionario
    public FuncionariosModel atualizarFuncionarioPorId(Long id, FuncionariosModel funcionariosAtualizado){
        if (funcionariosRepository.existsById(id)){
            funcionariosAtualizado.setId(id);
            return funcionariosRepository.save(funcionariosAtualizado);
        }
        return null;
    }

    //deletar por id
    //precisa ser um metodo void
    public void deletarFuncionarioPorId(Long id){
        funcionariosRepository.deleteById(id);
    }

}
