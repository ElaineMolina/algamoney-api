package com.molina.algamoney.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.molina.algamoney.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
