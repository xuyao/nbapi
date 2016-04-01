package cn.nb.exam.model;

import java.util.Date;

public class Anwser {
	
	private Integer anwserId;
	
	private String anwser;
	
	private Integer questionId;
	
	public Integer getAnwserId() {
		return anwserId;
	}

	public void setAnwserId(Integer anwserId) {
		this.anwserId = anwserId;
	}

	public String getAnwser() {
		return anwser;
	}

	public void setAnwser(String anwser) {
		this.anwser = anwser;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	private Date ctime;

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	
}
