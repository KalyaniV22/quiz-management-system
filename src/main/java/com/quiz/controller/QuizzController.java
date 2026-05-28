package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.dto.QuizDTO;
import com.quiz.entity.Question;
import com.quiz.request.QuizRequest;
import com.quiz.serviceimpl.QuizzServiceImpl;

@RestController
@RequestMapping("/quiz")
public class QuizzController {

	@Autowired
	public QuizzServiceImpl quizzserviceimpl;

	@PostMapping("/create")
	public ResponseEntity<String> createquiz(@RequestParam int noofquestion, @RequestParam String quizname,
			@RequestParam String category) {
		this.quizzserviceimpl.createquiz(quizname, noofquestion, category);
		String msg = "quizcreated!";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping("/getData/{id}")
	public ResponseEntity<List<QuizDTO>> getByid(@PathVariable("id") int id) {
		List<QuizDTO> quelist = this.quizzserviceimpl.listque(id);
		return new ResponseEntity<>(quelist, HttpStatus.OK);
	}
	@PostMapping("/submit")
	public ResponseEntity<String> submitQuiz(@RequestBody List<QuizRequest> request){
		String msg=quizzserviceimpl.submitQuiz(request);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
