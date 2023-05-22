package com.app.greentin.QuestionAns.Service;

import org.springframework.stereotype.Service;

import com.app.greentin.QuestionAns.Dto.AnsDto;
import com.app.greentin.QuestionAns.Response.AnsResponce;

@Service
public interface AnsServiceImp {

	AnsResponce savequestion(AnsDto request);

	AnsResponce getquestion();

}
