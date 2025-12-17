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

    //listar departamentos
    public List<DepartamentosModel> listarDepartamentos(){
        return departamentosRepository.findAll();
    }

    //listar por id
    public DepartamentosModel listarPorId(Long id){
        Optional<DepartamentosModel> departamentoPorId = departamentosRepository.findById(id);
        return departamentoPorId.orElse(null);
    }

}
