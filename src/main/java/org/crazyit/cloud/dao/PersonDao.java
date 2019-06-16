package org.crazyit.cloud.dao;

import java.util.List;

import org.crazyit.cloud.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonDao extends JpaRepository<Person, Integer>, PersonDaoCustom {

	List<Person> name(String name);
	
	List<Person> findByNameAndAge(String name, Integer age);
	
	List<Person> findByAgeLessThan(Integer age);
	
	@Query("select p from Person p where p.name = ?1")
	List<Person> findPersonName(String name);
	
	@Query(value = "SELECT * FROM CRA_PERSON WHERE NAME = ?1", nativeQuery = true)
	List<Person> findNativeName(String name);
}
