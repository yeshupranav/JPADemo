package com.jpademo.dao;

import java.util.List;

import com.jpademo.entity.Family;
import com.jpademo.entity.Person;

public interface PersonDao {
	public void persist(Person entity);

	public void update(Person entity, int id);

	public Person findById(int id);

	public void deleteById(int id);

	public List<Person> findAll();

}
