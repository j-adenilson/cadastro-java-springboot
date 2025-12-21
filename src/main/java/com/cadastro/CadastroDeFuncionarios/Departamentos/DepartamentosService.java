package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentosService {

    private DepartamentosRepository departamentosRepository;

    public DepartamentosService(DepartamentosRepository departamentosRepository) {
        this.departamentosRepository = departamentosRepository;
    }

    //criar departamentos
    public DepartamentosModel criarDepartamento(DepartamentosModel departamentos){
        return departamentosRepository.save(departamentos);
    }

    //listar departamentos
    public List<DepartamentosModel> listarDepartamentos(){
        return departamentosRepository.findAll();
    }

    //listar por id
    public DepartamentosModel listarPorId(Long id){
        Optional<DepartamentosModel> departamentoPorId = departamentosRepository.findById(id);
        return departamentoPorId.orElse(null);
    }

    //deletar por id
    //precisa ser um metodo void
    public void deletarDepartamentosPorId(Long id){
        departamentosRepository.deleteById(id);
    }

}
