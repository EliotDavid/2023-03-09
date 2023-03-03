package com.koreait.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koreait.board.entity.ExampleEntity;

@Repository
public interface ExampleRepository extends JpaRepository<ExampleEntity, Integer> {
    
}
