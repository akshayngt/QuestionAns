package com.app.greentin.QuestionAns.Response;

import java.util.List;
import java.util.Map;

import com.app.greentin.QuestionAns.Dto.AnsDto;
import com.app.greentin.QuestionAns.Model.Question;

public class AnsResponce 
{
	private String status;
	  
	  private String statuscode;
	  
	  private String result;
	  
	  private List<AnsDto>quslist;
	  
	  private List<Question> quslist1;



	public List<Question> getQuslist1() {
		return quslist1;
	}

	public void setQuslist1(List<Question> quslist1) {
		this.quslist1 = quslist1;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<AnsDto> getQuslist() {
		return quslist;
	}

	public void setQuslist(List<AnsDto> quslist) {
		this.quslist = quslist;
	}

	

}
