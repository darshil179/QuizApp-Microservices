package com.darshil.quizapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darshil.quizapp.model.Question;
import com.darshil.quizapp.service.QuestionsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionsService questionsService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionsService.getAllQuestions();
    }

    @GetMapping("category/{category}")    
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionsService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionsService.addQuestion(question);
    }
}
