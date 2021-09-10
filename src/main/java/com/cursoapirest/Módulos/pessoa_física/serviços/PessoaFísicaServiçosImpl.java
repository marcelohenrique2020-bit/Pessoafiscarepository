package com.cursoapirest.Módulos.pessoa_física.serviços;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import com.cursoapirest.Módulos.pessoa_física.repositório.PessoaFísicaRepositório;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PessoaFísicaServiçosImpl implements PessoasFísicasServiços{

    @Autowired
    PessoaFísicaRepositório pessoaFísicaRepositório;

    @Override
    public List<PessoaFísica> buscartodos() {
       return pessoaFísicaRepositório.findAll();

    }
}
