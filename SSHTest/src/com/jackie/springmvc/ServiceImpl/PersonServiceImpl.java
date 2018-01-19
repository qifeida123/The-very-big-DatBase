package com.jackie.springmvc.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackie.springmvc.Service.PersonService;
import com.jackie.springmvc.entities.Person;
import com.jackie.springmvc.repository.PersonRepository;
@Service
public class PersonServiceImpl implements PersonService {
	  @Autowired
	    private PersonRepository personRepository;

	    public Long savePerson() {
	        Person person = new Person();
	        person.setUsername("XRog");
	        person.setPhone("18381005946");
	        person.setAddress("chenDu");
	        person.setRemark("this is XRog");
	        return personRepository.save(person);
	    }
	

}
