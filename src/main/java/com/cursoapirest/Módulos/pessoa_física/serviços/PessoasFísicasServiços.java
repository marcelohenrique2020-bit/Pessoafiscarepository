package com.cursoapirest.Módulos.pessoa_física.serviços;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;

import java.util.List;

public interface PessoasFísicasServiços {

     List<PessoaFísica> buscartodos();

     PessoaFísica buscarPorId(Long id);

}
