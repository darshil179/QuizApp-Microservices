package com.darshil.quizapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("question")
public class QuestionController {

    @GetMapping("allQuestions")
    public String getAllQuestions(){
        return "All questions here";
    }
}
