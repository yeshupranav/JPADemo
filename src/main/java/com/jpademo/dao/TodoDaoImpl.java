package com.jpademo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpademo.entity.Todo;

public class TodoDaoImpl implements TodoDao {

	/*private static final String PERSISTENCE_UNIT_NAME = "todos";
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	
	EntityManager em = factory.createEntityManager();

	public void persist(Todo entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void update(Todo entity, Long id) {
		Todo todo = em.find(Todo.class, id);
		em.getTransaction().begin();
		todo = entity;
		em.getTransaction().commit();

	}

	public Todo findById(Long id) {
		Todo todo = em.find(Todo.class, id);
		return todo;
	}

	public void deleteById(Long id) {
		Todo todo = findById(id);
		em.getTransaction().begin();
		em.remove(todo);
		em.getTransaction().commit();
	}

	public List<Todo> findAll() {

		// read the existing entries and write to console
		Query q = em.createQuery("select t from Todo t");
		List<Todo> todoList = q.getResultList();
		return todoList;
*/	}


