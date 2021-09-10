package com.cursoapirest.Módulos.config;

import com.cursoapirest.Módulos.pessoa_física.repositório.PessoaFísicaRepositório;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private PessoaFísicaRepositório pessoaFísicaRepositório;

    @Override
    public void run(String... args) throws Exception {
        PessoaFisica pessoaFisica1 = new PessoaFisica(null, "Maria da Silva","mariadasilva@gmail.com","932.830.370-27");
        PessoaFisica pessoaFisica2 = new PessoaFisica(null, "João da Silva","joaodasilva@gmail.com","848.102.930-09");

        pessoaFisicaRepositorio.saveAll(Arrays.asList(pessoaFisica1,pessoaFisica2);

    }
}

