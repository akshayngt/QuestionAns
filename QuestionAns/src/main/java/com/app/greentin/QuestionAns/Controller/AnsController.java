package com.app.greentin.QuestionAns.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.greentin.QuestionAns.Dto.AnsDto;
import com.app.greentin.QuestionAns.Response.AnsResponce;
import com.app.greentin.QuestionAns.Service.AnsServiceImp;


@CrossOrigin
@RestController
@RequestMapping(value = "/question")
public class AnsController 
{
	@Autowired
	AnsServiceImp ansService;
	
	@PostMapping(value = "/savequestion")
	public AnsResponce savequestion(@RequestBody AnsDto request)
	{
		return ansService.savequestion(request);
		
	}
	@GetMapping(value = "/getquestion")
	public AnsResponce getquestion()
	{
		return ansService.getquestion();
		
	}

}
