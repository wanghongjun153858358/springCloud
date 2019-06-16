package org.crazyit.cloud.service;

import java.util.List;

import org.crazyit.cloud.dao.PersonDao;
import org.crazyit.cloud.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	public List<Person> getPersons() {
		return personDao.findAll();
	}
	
	public List<Person> myQuery() {
		return personDao.myQuery();
	}
	
	public List<Person> name(String name) {
		return personDao.name(name);
	}
	
	public List<Person> nameAndAge(String name, Integer age) {
		return personDao.findByNameAndAge(name, age);
	}
	
	public List<Person> ageLessThan(Integer age) {
		return personDao.findByAgeLessThan(age);
	}
	
	public List<Person> findPersonName(String name) {
		return personDao.findPersonName(name);
	}
	
	public List<Person> findNativeName(String name) {
		return personDao.findNativeName(name);
	}
	
	
}
