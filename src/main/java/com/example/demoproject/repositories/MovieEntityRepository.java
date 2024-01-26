package com.example.demoproject.repositories;

import com.example.demoproject.dto.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieEntityRepository extends JpaRepository<MovieEntity, Long> {
    // You can add custom query methods if needed
}