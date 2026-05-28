package com.quiz.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dto.QuizDTO;
import com.quiz.entity.Question;
import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepository;
import com.quiz.repository.QuizzRepository;
import com.quiz.request.QuizRequest;
import com.quiz.service.QuizzService;

@Service
public class QuizzServiceImpl implements QuizzService {
	@Autowired
	private QuizzRepository quizzrepo;
	@Autowired
	private QuizRepository quizrepo;

	@Override
	public String createquiz(String quizName, int noofquestion, String category) {
		Quiz quiz = new Quiz();
		quiz.setTitle(quizName);
		List<Question> question = quizzrepo.findRandomQuestion(category, noofquestion);
		quiz.setQuestion(question);
		quizzrepo.save(quiz);
		return "created";
	}

	@Override
	public List<QuizDTO> listque(int id) {
		Quiz quiz = quizzrepo.findById(id).get();
		List<Question> quelist = quiz.getQuestion();
		List<QuizDTO> list = new ArrayList<>();
		for (Question q : quelist) {
			QuizDTO dto = new QuizDTO(q.getId(), q.getQuestion(), q.getOption1(), q.getOption2(), q.getOption3(),
					q.getOption4());
			list.add(dto);
		}
		return list;
	}

	@Override
	public String submitQuiz(List<QuizRequest> request) {
		int correctans=0;
		for(QuizRequest quizrequest: request) {
			int id=quizrequest.getId();
			Question que=quizrepo.findById(id).get();
			if(quizrequest.getSelectopt() == que.getCorrectAnswer()) {
				//true
				correctans++;
			}
		}
		String msg="your score is "+correctans;
		return msg;
	}
	

}
