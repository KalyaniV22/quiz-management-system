package com.quiz.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entity.Question;
import com.quiz.repository.QuizRepository;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepository quizrepo;

	@Override
	public List<Question> getAllQuestion() {
		List<Question> list = this.quizrepo.findAll();
		return list;
	}

}