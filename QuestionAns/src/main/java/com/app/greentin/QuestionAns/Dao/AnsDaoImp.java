package com.app.greentin.QuestionAns.Dao;

import java.util.List;
import java.util.Map;

import com.app.greentin.QuestionAns.Dto.AnsDto;
import com.app.greentin.QuestionAns.Model.Question;

public interface AnsDaoImp {

	boolean savequestion(AnsDto request);


	List<Question> getquestion();

}
