package com.jackie.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



import com.jackie.springmvc.entities.User7;
@RequestMapping("/niu")
@Controller
public class HelloWorld {

	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("nihao123");
		return "success";
	}
	@RequestMapping("/today")
	public String hello2(){
		System.out.println("nihao456");
		return "today";
	}
	@RequestMapping("/picture")
	public String pink(){
		System.out.println("nihao789");
		return "rabbit";
	}
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable(value="id") Integer id){
	    System.out.println("testPathVariable:" + id);
	    return "success";
	}
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String username, @RequestParam(value="age", required=false, defaultValue="0") int age){
	    System.out.println("testRequestParam" + " username:" + username + " age:" +age);
	    return "success";
	}
	@RequestMapping(value="/testRequestHeader")
	public String testRequestHeader(@RequestHeader(value="Accept-Language") String language){
	    System.out.println("testRequestHeader Accept-Languge:" + language);
	    return "success";
	}
	@RequestMapping(value="/testPojo")
	public String testPojo(User7 user){
	    System.out.println("testPojo: " + user);
	    return "success";
	}
	@RequestMapping("/testViewAndViewResolver")
	public String testViewAndViewResolver(){
	    System.out.println("testViewAndViewResolver");
	    return "success";
	}
	
}
