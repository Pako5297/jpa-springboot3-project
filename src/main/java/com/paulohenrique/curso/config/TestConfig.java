package com.paulohenrique.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.paulohenrique.curso.entities.Animal;
import com.paulohenrique.curso.entities.Pessoa;
import com.paulohenrique.curso.repositories.AnimalRepository;
import com.paulohenrique.curso.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private AnimalRepository animalRepository;

	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa("Paulo", "1234", "8888888");
		Pessoa p2 = new Pessoa("Joao", "4321", "7777777");
		Pessoa p3 = new Pessoa("Maria", "5678", "6666666");
		Pessoa p4 = new Pessoa("Marlon", "8765", "5555555");
		Pessoa p5 = new Pessoa("Fred", "9012", "4444444");
		
		Animal a1 = new Animal("Cão", "Poodle", p2);
		Animal a2 = new Animal("Gato", "Vira Lata", p4);
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		animalRepository.saveAll(Arrays.asList(a1, a2));
		
	}

}
