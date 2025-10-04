package com.darshil.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darshil.quizapp.model.Quiz;


public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
