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
	
	public Pessoa atualizarPessoa(Long id, Pessoa obj) {
		Pessoa pessoa = pessoaRepository.getReferenceById(id);
		updateData(pessoa, obj);
		return pessoaRepository.save(pessoa);
	}

	private void updateData(Pessoa pessoa, Pessoa obj) {
		pessoa.setNome(obj.getNome());
		pessoa.setCpf(obj.getCpf());
		pessoa.setTelefone(obj.getTelefone());
		
	}

}
