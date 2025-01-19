package com.caiocezar.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiocezar.workshopmongo.domain.User;
import com.caiocezar.workshopmongo.repository.UserRepository;
import com.caiocezar.workshopmongo.services.exception.ObjectNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository repo;// mecanismo de injeção automatica do spring

	public List<User> findAll() {
		return repo.findAll();// aqui ira retornar todos os objetos do usuario

	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}

}
