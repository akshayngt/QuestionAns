package com.app.greentin.QuestionAns.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "question")
public class Question 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "que_id")
  private int id;
  
  @Column(name="que_question")
  private String queName;
  
  @OneToMany(mappedBy = "question")
  @JsonManagedReference
  private Set<Answer> answerList;
  
  
  
//  @OneToMany()
//  @JoinColumn(name = "ans_id")
//  private List<Answer> answer = new ArrayList<>);
// 
	
  
  public Question() {
		super();
		
	}

	public Question(int id) {
		this.id = id;
	}

public int getId() {
	return id;
}

public Set<Answer> getAnswerList() {
	return answerList;
}

public void setAnswerList(Set<Answer> answerList) {
	this.answerList = answerList;
}

public void setId(int id) {
	this.id = id;
}

public String getQueName() {
	return queName;
}

public void setQueName(String queName) {
	this.queName = queName;
}



}
