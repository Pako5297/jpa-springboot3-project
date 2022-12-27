package com.paulohenrique.curso.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.curso.entities.Animal;
import com.paulohenrique.curso.entities.Pessoa;

@RestController
@RequestMapping(value = "/animais")
public class AnimalController {
	
	@GetMapping
	public ResponseEntity<Animal> BuscarTodos(){
		Pessoa p = new Pessoa("Paulo","1234","8888888");
		Animal a = new Animal("Cão", "Poodle", p);
		return ResponseEntity.ok().body(a);
	}

}
