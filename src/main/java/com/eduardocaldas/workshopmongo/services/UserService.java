package com.eduardocaldas.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import com.eduardocaldas.workshopmongo.domain.User;
import com.eduardocaldas.workshopmongo.repositories.UserRepository;
import com.eduardocaldas.workshopmongo.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}