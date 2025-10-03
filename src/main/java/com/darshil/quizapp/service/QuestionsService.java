package com.darshil.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.darshil.quizapp.Question;

import com.darshil.quizapp.dao.QuestionDao;

import java.util.List;

@Service
public class QuestionsService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
}
