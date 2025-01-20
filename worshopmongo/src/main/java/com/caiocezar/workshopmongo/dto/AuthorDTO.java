package com.caiocezar.workshopmongo.dto;

import java.io.Serializable;

import com.caiocezar.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;

	public AuthorDTO() {// construtor vazio sem argumentos

	}

	public AuthorDTO(User obj) {// construtor com rgumentos recebendo o User como parametro
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
