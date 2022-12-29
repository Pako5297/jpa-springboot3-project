package com.paulohenrique.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.curso.entities.Animal;
import com.paulohenrique.curso.repositories.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	private AnimalRepository pessoaRepository;
	
	public List<Animal> BuscarTodos(){
		return pessoaRepository.findAll();
	}
	
	public Animal buscarPorId(Long id) {
		Optional<Animal> obj = pessoaRepository.findById(id);
		return obj.get();
	}

}
