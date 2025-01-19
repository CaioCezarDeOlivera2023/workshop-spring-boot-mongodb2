package com.caiocezar.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.caiocezar.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {//aqui podera ser feito varias operações do usuario como; salver, recuperar...

}
