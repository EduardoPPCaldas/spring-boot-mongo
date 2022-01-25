package com.eduardocaldas.workshopmongo.repositories;

import com.eduardocaldas.workshopmongo.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}