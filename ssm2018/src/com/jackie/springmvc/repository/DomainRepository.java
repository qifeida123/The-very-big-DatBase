package com.jackie.springmvc.repository;

import java.io.Serializable;
import java.util.List;
import com.jackie.springmvc.entities.Person;

public interface DomainRepository<T,PK extends Serializable>{
   /* T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();*/
    
    public void create(Person p);
	public void delete(int id);
	public void update(Person p);
	
	public Person getByUuid(int id);
	public List<Person> getByCondition(Person p);
	
}