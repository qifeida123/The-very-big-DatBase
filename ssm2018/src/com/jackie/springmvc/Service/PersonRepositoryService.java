package com.jackie.springmvc.Service;

import java.util.List;

import com.jackie.springmvc.entities.Person;

public interface PersonRepositoryService //extends DomainRepository<Person,Long>
{
	  	public void create(Person p);
		public void delete(int id);
		public void update(Person p);
		
		public Person getById(int id);
		public List<Person> getByCondition(Person p);
}
