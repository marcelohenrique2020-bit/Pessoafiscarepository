package com.cursoapirest.Módulos.pessoa_física.Rest;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PessoaFísicaAPI {

    ResponseEntity<List<PessoaFísica>> listarPessoas();

    ResponseEntity<PessoaFísica> BuscarPorId(Long id);

    public PessoaFísica Inserir(PessoaFísica pessoaFísica);

    ResponseEntity<PessoaFísica> Adicionar( PessoaFísica pessoaFísica);
}
