package com.quiz.request;

public class QuizRequest {

	private int id;

	private int selectopt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSelectopt() {
		return selectopt;
	}

	public void setSelectopt(int selectopt) {
		this.selectopt = selectopt;
	}

	@Override
	public String toString() {
		return "QuizRequest [id=" + id + ", selectopt=" + selectopt + "]";
	}

}
