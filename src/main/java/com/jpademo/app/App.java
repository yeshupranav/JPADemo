package com.jpademo.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpademo.dao.TodoDaoImpl;
import com.jpademo.entity.Todo;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		
		

	/*	TodoDaoImpl dao = new TodoDaoImpl();
		List<Todo> todoList = dao.findAll();

		for (Todo todo : todoList) {
			System.out.println(todo);
		}
		System.out.println("Size: " + todoList.size());

		Todo todo = new Todo();

		todo.setSummary("This is a test");
		todo.setDescription("This is a test");
		
	//	 * Save the data
		 
		dao.persist(todo);
		todo.setDescription("some what better");
		todo.setSummary("Improved");
		
		 * Update the data
		 
		dao.update(todo, todo.getId());
		System.out.println("todo after updation" + todo);
		System.out.println(todo.toString());

		
		 * Delete the data
		 
		dao.deleteById((long) 3);

*/}
}
