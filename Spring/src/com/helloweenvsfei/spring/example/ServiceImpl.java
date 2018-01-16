package com.helloweenvsfei.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements IService {
	
	private IDao dao;
	
	public void service(String name){
		System.out.println(dao.sayHello(name));
	}
	/*@Autowired
	public ServiceImpl(IDao dao) {
		super();
		this.dao = dao;
	}*/

	public IDao getDao(){
		return dao;
	}
	@Autowired
	public void setDao(IDao dao){
		this.dao = dao;
	}
}	
