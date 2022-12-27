package com.paulohenrique.curso.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.curso.enrities.Pessoa;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {
	
	@GetMapping
	public ResponseEntity<Pessoa> BuscarTodos(){
		Pessoa p = new Pessoa(1L,"Paulo","1234","8888888");
		return ResponseEntity.ok().body(p);
	}

}
