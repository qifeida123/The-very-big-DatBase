package com.jackie.springmvc.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jackie.springmvc.Service.PersonRepositoryService;
import com.jackie.springmvc.entities.Person;
import com.jackie.springmvc.repository.PersonRepository;
@Service
@Transactional
public class PersonServiceImpl implements PersonRepositoryService {
	  @Autowired
	    private PersonRepository personRepository;

	    public PersonRepository getPersonRepository() {
		return personRepository;
	}
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
		public Person getById(int id) {
			return  personRepository.getById(id);
		}
		@Override
		public void create(Person p) {
			personRepository.create(p);	
		}

		@Override
		public void update(Person p) {
			personRepository.update(p);
		}

		@Override
		public void delete(int id) {
			personRepository.delete(id);
		}
		@Override
		public List<Person> getByCondition(Person p) {
			return personRepository.getByCondition(p);
		}    
}
