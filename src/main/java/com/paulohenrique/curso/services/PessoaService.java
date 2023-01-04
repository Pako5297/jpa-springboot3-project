package com.paulohenrique.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.curso.entities.Pessoa;
import com.paulohenrique.curso.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> BuscarTodos(){
		return pessoaRepository.findAll();
	}
	
	public Pessoa buscarPorId(Long id) {
		Optional<Pessoa> obj = pessoaRepository.findById(id);
		return obj.get();
	}
	
	public Pessoa adicionarPessoa(Pessoa obj) {
		return pessoaRepository.save(obj);
	}
	
	public void deletar(Long id) {
		pessoaRepository.deleteById(id);
	}

}
