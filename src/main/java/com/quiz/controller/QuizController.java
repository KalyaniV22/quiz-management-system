package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Question;
import com.quiz.serviceimpl.QuizServiceImpl;

@RestController
@RequestMapping("/question")
public class QuizController {
	
    @Autowired
	private QuizServiceImpl serviceimpl;
	@GetMapping("/getAll")
    public ResponseEntity<List<Question>> getAll(){
    	List<Question> l=serviceimpl.getAllQuestion();
		return new ResponseEntity<>(l, HttpStatus.OK);
    }
}
