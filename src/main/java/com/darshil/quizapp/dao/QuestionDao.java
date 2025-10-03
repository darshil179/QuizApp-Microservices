package com.darshil.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.darshil.quizapp.Question;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{


}
