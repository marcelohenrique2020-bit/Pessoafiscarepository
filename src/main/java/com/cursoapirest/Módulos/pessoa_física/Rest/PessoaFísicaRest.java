package com.cursoapirest.Módulos.pessoa_física.Rest;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import com.cursoapirest.Módulos.pessoa_física.serviços.PessoasFísicasServiços;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping(value= "/{id}");

    @Override
    public ResponseEntity<PessoaFísica> BuscarPorId(@PathVariable Long id) {
        PessoaFísica pessoaFísica = pessoasFísicasServiços.buscarPorId(id);
        return ResponseEntity.ok().body(pessoaFísica);

    }

    @PostMapping
    public ResponseEntity<PessoaFísica> Adicionar(@RequestBody PessoaFísica pessoaFísica){
        pessoaFísica = pessoasFísicasServiços.inserir(pessoaFísica);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path( "/{id}" )
                .buildAndExpand(pessoaFísica.getId()).toUri();
        return ResponseEntity.created(uri).body(pessoaFísica);
    }
}
