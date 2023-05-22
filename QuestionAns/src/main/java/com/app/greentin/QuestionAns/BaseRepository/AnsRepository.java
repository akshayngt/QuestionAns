package com.app.greentin.QuestionAns.BaseRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class AnsRepository
{
	@PersistenceContext
	 EntityManager entitymanager;
	 
	 protected Session getCurrentSession()
	 {
		return entitymanager.unwrap(Session.class);
		 
	 }

}
