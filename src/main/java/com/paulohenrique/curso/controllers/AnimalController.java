package com.paulohenrique.curso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.curso.entities.Animal;
import com.paulohenrique.curso.entities.Pessoa;
import com.paulohenrique.curso.services.AnimalService;

@RestController
@RequestMapping(value = "/animais")
public class AnimalController {
	
	@Autowired
	AnimalService service;
	
	@GetMapping
	public ResponseEntity<List<Animal>> BuscarTodos(){
		List<Animal> list = service.BuscarTodos();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Animal> buscarPorId(@PathVariable Long id){
		Animal obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

}
