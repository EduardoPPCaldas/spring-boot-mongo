package com.eduardocaldas.workshopmongo.services;

import java.util.Optional;

import com.eduardocaldas.workshopmongo.domain.Post;
import com.eduardocaldas.workshopmongo.repositories.PostRepository;
import com.eduardocaldas.workshopmongo.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}