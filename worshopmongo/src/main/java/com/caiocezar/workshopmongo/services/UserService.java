package com.caiocezar.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiocezar.workshopmongo.domain.User;
import com.caiocezar.workshopmongo.dto.UserDTO;
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

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User update(User obj) {
		User newObj = findById(obj.getId());
		upDate(newObj, obj);
		return repo.save(newObj);
	}
	
	private void upDate(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		
	}

	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
}
