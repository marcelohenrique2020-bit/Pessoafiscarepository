package com.cursoapirest.Módulos.pessoa_física.serviços;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import com.cursoapirest.Módulos.pessoa_física.repositório.PessoaFísicaRepositório;
import com.cursoapirest.exception.EntidadeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaFísicaServiçosImpl implements PessoasFísicasServiços{

    @Autowired
    PessoaFísicaRepositório pessoaFísicaRepositório;

    @Override
    public List<PessoaFísica> buscartodos() {
       return pessoaFísicaRepositório.findAll();
    }

    @Override
    public PessoaFísica buscarPorId(Long id){

      @Optional<PessoaFísica> obj = pessoaFísicaRepositório.findById(id);
      return obj.orElseThros(() -> new EntidadeNotFoundException("id not found" + id));

    }

    @Override
    public PessoaFísica Inserir(PessoaFísica pessoaFísica){
        return pessoaFísicaRepositório.save(pessoaFísica);

    }
}
