package com.cursoapirest.Módulos.pessoa_física.repositório;

import com.cursoapirest.Módulos.pessoa_física.model.PessoaFísica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFísicaRepositório extends JpaRepository<PessoaFísica, Long> {
}
