package com.jackie.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jackie.springmvc.entities.User7;
@RequestMapping("/springmvc")
@Controller
public class Test {
	@RequestMapping(value="/testRest", method=RequestMethod.POST)
	public String testRest(@RequestParam(value="username")String username){
	    System.out.println("test post"+username);
	    return "success";
	}
	     
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
	public String testRest(@PathVariable(value="id") Integer id){
	    System.out.println("test get:" + id);
	    return "success";
	}
	@ResponseBody
	@RequestMapping(value="/testPojo.do",method=RequestMethod.POST)
	public User7 testPojo(User7 user){
	    System.out.println("testPojo: " + user);
	    return user;
	}
}
