package com.helloweenvsfei.spring.example;





import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	 public static Logger logger = Logger.getLogger(SpringTest.class);
	  public static void main(String[] args) {
		  BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
	        IService hello =   (IService) beanFactory.getBean("serviceImpl");
	        hello.service("Helloween");
	        beanFactory.getClass();
	        
	      IDao hello1 =(IDao)beanFactory.getBean("daoImpl");
	 
	      System.out.println(hello1.sayHello("helloween1"));
	  }
}

