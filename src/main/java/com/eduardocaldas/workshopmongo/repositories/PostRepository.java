package com.eduardocaldas.workshopmongo.repositories;

import com.eduardocaldas.workshopmongo.domain.Post;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
}