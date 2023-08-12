package com.khd.quizservice.dao;


import com.khd.quizservice.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
