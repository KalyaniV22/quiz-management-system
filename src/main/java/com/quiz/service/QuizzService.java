package com.quiz.service;

import java.util.List;

import com.quiz.dto.QuizDTO;
import com.quiz.request.QuizRequest;

public interface QuizzService {

	//public String createquiz(String quizName,int noofquestion,String category);
	
	public List<QuizDTO> listque(int id);
	
	public String submitQuiz(List<QuizRequest> request);
}
