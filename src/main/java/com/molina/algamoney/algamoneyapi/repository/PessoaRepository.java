package com.molina.algamoney.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.molina.algamoney.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository <Pessoa, Long> {

}
