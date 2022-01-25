package com.eduardocaldas.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import com.eduardocaldas.workshopmongo.domain.User;
import com.eduardocaldas.workshopmongo.dto.UserDTO;
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

    public User insert(User obj){
        return repo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}