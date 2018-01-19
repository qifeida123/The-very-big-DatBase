package com.jackie.springmvc.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jackie.springmvc.Service.PersonService;
@Controller
public class MainController {
	 	@Autowired
	    private PersonService personService;

	    @RequestMapping(value = "/savePerson", method = RequestMethod.GET)
	    @ResponseBody
	    public String savePerson(){
	        personService.savePerson();
	        return "success!";
	    }
}
