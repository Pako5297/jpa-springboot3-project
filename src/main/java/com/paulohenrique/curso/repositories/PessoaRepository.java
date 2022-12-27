package com.paulohenrique.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.curso.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
