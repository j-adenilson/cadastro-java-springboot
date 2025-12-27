package com.cadastro.CadastroDeFuncionarios.Funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FuncionariosService {

    private FuncionariosRepository funcionariosRepository;

    private FuncionariosMapper funcionariosMapper;

    public FuncionariosService(FuncionariosRepository funcionariosRepository, FuncionariosMapper funcionariosMapper) {
        this.funcionariosRepository = funcionariosRepository;
        this.funcionariosMapper = funcionariosMapper;
    }

    //criar funcionario
//    public FuncionariosDTO criarFuncionario(FuncionariosDTO funcionariosDTO){
//        FuncionariosModel funcionarios = new funcionariosMapper.map(funcionariosDTO);
//        funcionarios = funcionariosRepository.save(funcionarios);
//        return funcionariosMapper.map(funcionarios);
//    }

    public FuncionariosDTO criarFuncionario(FuncionariosDTO funcionariosDTO){
        FuncionariosModel funcionarios = funcionariosMapper.map(funcionariosDTO);
        funcionarios = funcionariosRepository.save(funcionarios);
        return funcionariosMapper.map(funcionarios);
    }

    //listar todos os funcionarios
//    public List<FuncionariosModel> listarFuncionarios(){
//        return funcionariosRepository.findAll();
//    }

    public List<FuncionariosDTO> listarFuncionarios(){
        List<FuncionariosModel> funcionarios = funcionariosRepository.findAll();
        return funcionarios.stream()
                .map(funcionariosMapper::map)
                .collect(Collectors.toList());
    }

    //listar por ID
    public FuncionariosDTO listarPorId(Long id){
        Optional<FuncionariosModel> funcionarioPorId = funcionariosRepository.findById(id);
        return funcionarioPorId.map(funcionariosMapper::map).orElse(null);
    }

    //altualizar funcionario
//    public FuncionariosModel atualizarFuncionarioPorId(Long id, FuncionariosModel funcionariosAtualizado){
//        if (funcionariosRepository.existsById(id)){
//            funcionariosAtualizado.setId(id);
//            return funcionariosRepository.save(funcionariosAtualizado);
//        }
//        return null;
//    }

    public FuncionariosDTO atualizarFuncionarioPorId(Long id, FuncionariosDTO funcionariosDTO){
        Optional<FuncionariosModel> funcionariosPorId = funcionariosRepository.findById(id);
        if (funcionariosPorId.isPresent()){
            FuncionariosModel funcionarioAtualizado = funcionariosMapper.map(funcionariosDTO);
            funcionarioAtualizado.setId(id);
            funcionarioAtualizado.setId(id);
            FuncionariosModel funcionarioSalvo = funcionariosRepository.save(funcionarioAtualizado);
            return funcionariosMapper.map(funcionarioSalvo);
        }
        return null;
    }

    //deletar por id
    //precisa ser um metodo void
    public void deletarFuncionarioPorId(Long id){
        funcionariosRepository.deleteById(id);
    }

//    //====criado ao criar o criar a rota criar funcionario
//    private class map extends FuncionariosModel {
//        public map(FuncionariosDTO funcionariosDTO) {
//        }
//    }
//    //====
}
