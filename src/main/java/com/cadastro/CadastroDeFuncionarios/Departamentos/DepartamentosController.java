package com.cadastro.CadastroDeFuncionarios.Departamentos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DepartamentosController {

    @GetMapping("/departamento")
    public String homeDepartamento(){
        return "Olá do departamento";
    }
}
