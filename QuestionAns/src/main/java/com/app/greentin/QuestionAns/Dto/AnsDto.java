package com.app.greentin.QuestionAns.Dto;

import java.util.List;

import com.app.greentin.QuestionAns.Model.Answer;
import com.app.greentin.QuestionAns.Model.Question;


public class AnsDto 
{
  private int id;
 
  private String quename;
  
  private String ansname;
  
  private Question question;
  
  private List<AnsDto> quelist;
  
  private List<AnsDto> anslist;
  
  private Answer answer;
 
	
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAnsname() {
	return ansname;
}

public void setAnsname(String ansname) {
	this.ansname = ansname;
}

public String getQuename() {
	return quename;
}

public void setQuename(String quename) {
	this.quename = quename;
}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}

public List<AnsDto> getQuelist() {
	return quelist;
}

public void setQuelist(List<AnsDto> quelist) {
	this.quelist = quelist;
}

public Answer getAnswer() {
	return answer;
}

public void setAnswer(Answer answer) {
	this.answer = answer;
}

public List<AnsDto> getAnslist() {
	return anslist;
}

public void setAnslist(List<AnsDto> anslist) {
	this.anslist = anslist;
}

  
}
