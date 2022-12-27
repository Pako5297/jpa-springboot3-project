package com.paulohenrique.curso.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.curso.enrities.Animal;
import com.paulohenrique.curso.enrities.Pessoa;

@RestController
@RequestMapping(value = "/animais")
public class AnimalController {
	
	@GetMapping
	public ResponseEntity<Animal> BuscarTodos(){
		Pessoa p = new Pessoa(1L,"Paulo","1234","8888888");
		Animal a = new Animal(1L, "Cão", "Poodle", p);
		return ResponseEntity.ok().body(a);
	}

}
