package com.app.greentin.QuestionAns.Dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.app.greentin.QuestionAns.BaseRepository.AnsRepository;
import com.app.greentin.QuestionAns.Dto.AnsDto;
import com.app.greentin.QuestionAns.Model.Answer;
import com.app.greentin.QuestionAns.Model.Question;
import com.app.greentin.QuestionAns.Service.AnsServiceImp;

@Component
@Transactional
public class AnsDao extends AnsRepository implements AnsDaoImp {
	@Autowired
	AnsServiceImp ansService;

	@Override
	public boolean savequestion(AnsDto request) {
		Session session = getCurrentSession();
		boolean flag = false;
//		int id=0;

		if (!CollectionUtils.isEmpty(request.getQuelist())) {
			for (AnsDto obj : request.getQuelist()) {
				Question que = new Question();

				if (obj.getQuename() != null) {
					que.setQueName(obj.getQuename());
				}
				session.save(que);
//				id=que.getId();

				if (obj.getAnslist() != null) {
					for (AnsDto obj1 : obj.getAnslist())
					{
						Answer ans = new Answer();
						if (obj1.getAnsname() != null) {
							ans.setAnsName(obj1.getAnsname());
							ans.setQuestion(new Question(que.getId()));
							session.save(ans);
						}flag=true;

					}

				}
				

			}
		}
		return flag;
	}

	@Override
	public List<Question> getquestion() {
		Session session = getCurrentSession();
//		List<AnsDto> list = new ArrayList<>();
		
		@SuppressWarnings("unchecked")
		List<Question> list = session.createQuery("FROM Question").getResultList();
	
		return list;
		
	}
}
	
	





//List<AnsDto> list = session.createQuery("SELECT q.id, q.queName, a.id, a.ansName "
//        + "FROM Question q INNER JOIN q.answers a "
//        + "WHERE q.id = :a.question.id")
//        .setParameter("questionId", 3)
//        .getResultList();


	