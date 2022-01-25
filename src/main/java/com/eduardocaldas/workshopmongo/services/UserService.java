package com.eduardocaldas.workshopmongo.services;

import java.util.List;

import com.eduardocaldas.workshopmongo.domain.User;
import com.eduardocaldas.workshopmongo.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}