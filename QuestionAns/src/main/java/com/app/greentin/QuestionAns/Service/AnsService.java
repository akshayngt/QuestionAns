package com.app.greentin.QuestionAns.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.greentin.QuestionAns.Dao.AnsDaoImp;
import com.app.greentin.QuestionAns.Dto.AnsDto;
import com.app.greentin.QuestionAns.Model.Question;
import com.app.greentin.QuestionAns.Response.AnsResponce;

@Service
public class AnsService implements AnsServiceImp
{
	@Autowired
	AnsDaoImp ansDao;

	@Override
	public AnsResponce savequestion(AnsDto request)
	{
		AnsResponce res=new AnsResponce();
		boolean flag=ansDao.savequestion(request);
		
		if(flag)
		{
			res.setStatus("save recored successsfuly..");
			res.setStatuscode("200");
			res.setResult("true");
			
		}else
		{
			res.setStatus(" recored not save  successfully..");
			res.setStatuscode("100");
			res.setResult("false");
		}
		
		return res;
	}

	@Override
	public AnsResponce getquestion()
	{
		AnsResponce res=new AnsResponce();
		List<Question> flag=ansDao.getquestion();
		
		if(flag!=null)
		{
			res.setStatus("save recored successsfull..");
			res.setStatuscode("200");
			res.setResult("true");
			res.setQuslist1(flag);
		}else
		{
			res.setStatus(" recored not save  successsfull..");
			res.setStatuscode("100");
			res.setResult("false");
		}
		
		return res;
	}
	

}
