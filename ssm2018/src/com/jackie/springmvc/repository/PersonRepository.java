package com.jackie.springmvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jackie.springmvc.entities.Person;
@Repository
public interface PersonRepository //extends DomainRepository<Person,Long>
{
	  	public void create(Person p);
		public void delete(int id);
		public void update(Person p);
		
		public Person getById(int id);
		public List<Person> getByCondition(Person p);
}
