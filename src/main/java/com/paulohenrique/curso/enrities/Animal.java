package com.paulohenrique.curso.enrities;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private String especie;
	private String raca;
	private Pessoa pessoa;
	
	public Animal() {
	}

	public Animal(long id, String especie, String raca, Pessoa pessoa) {
		super();
		this.id = id;
		this.especie = especie;
		this.raca = raca;
		this.pessoa = pessoa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return id == other.id;
	}
	
	

}
