package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.quiz.entity.Question;
import com.quiz.entity.Quiz;

@Repository
public interface QuizzRepository extends JpaRepository<Quiz,Integer>{
	@Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :noofquestion",
		    nativeQuery = true
		)
		List<Question> findRandomQuestion(@Param("category") String category,
		                                  @Param("noofquestion") int noofquestion);

}
