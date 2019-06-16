package org.crazyit.cloud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.crazyit.cloud.entity.Person;

public class PersonDaoImpl implements PersonDaoCustom {
	
	@PersistenceContext
	private EntityManager em;

	public List<Person> myQuery() {
		Query q = em.createQuery("from Person");
		return q.getResultList();
	}

}
