package com.cursoapirest.Módulos.pessoa_física.Rest;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PessoaFísicaAPI {

    ResponseEntity<List<PessoaFísica>> listarPessoas();
}
