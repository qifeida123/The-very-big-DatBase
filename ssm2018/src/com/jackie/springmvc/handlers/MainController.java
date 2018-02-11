package com.jackie.springmvc.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jackie.springmvc.Service.PersonRepositoryService;
import com.jackie.springmvc.entities.Person;
@Controller
public class MainController {
	 	@Autowired
	    private PersonRepositoryService personsepositoryservice;

	    @RequestMapping(value = "/savePerson")
	    public String savePerson(){
	    	System.out.println("name:"+personsepositoryservice.getById(1));
	        return "success";
	    }
}
