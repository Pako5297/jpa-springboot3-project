package com.paulohenrique.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.curso.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long>{

}
