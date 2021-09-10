package com.cursoapirest.Módulos.pessoa_física.Rest;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import com.cursoapirest.Módulos.pessoa_física.serviços.PessoasFísicasServiços;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoafísica")
public class PessoaFísicaRest implements PessoaFísicaAPI {

    @Autowired
    PessoasFísicasServiços pessoasFísicasServiços;


    @GetMapping
    public ResponseEntity<List<PessoaFísica>> listarPessoas() {
        List<PessoaFísica> list = pessoasFísicasServiços.buscartodos();
        return ResponseEntity.ok().body(list);
    }
}
