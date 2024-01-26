package com.example.demoproject.services;

import com.example.demoproject.repositories.MovieEntityRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.dto.MovieEntity;
@Service
@Transactional
public class MovieEntityService {

    @Autowired
    private EntityManager entityManager;

    public MovieEntity findById(Long id) {
//        yourEntityRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
        return entityManager.find(MovieEntity.class, id);
    }

    @Autowired
    private MovieEntityRepository yourEntityRepository;

    public MovieEntity saveEntity(MovieEntity yourEntity) {
        return yourEntityRepository.save(yourEntity);
    }

    // Add other methods as needed
}