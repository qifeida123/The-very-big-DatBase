package com.helloweenvsfei.spring.example;

import org.springframework.stereotype.Component;

@Component
public class Between {
	private int a=1;
	private int b=2;
	public void BeforeTest(){
		System.out.println("前置切面");
	}
	public void AfterTest(){
		System.out.println("后置切面");
	}
	
}
