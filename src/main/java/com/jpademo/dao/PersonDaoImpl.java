package com.jpademo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpademo.entity.Family;
import com.jpademo.entity.Person;

public class PersonDaoImpl implements PersonDao {
	private static final String PERSISTENCE_UNIT_NAME = "todos";
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	EntityManager em = factory.createEntityManager();

	public void persist(Person entity) {

		em.getTransaction().begin();
		// em.persist(entity.getFamily());
		em.persist(entity);
		em.getTransaction().commit();
	}

	public void update(Person entity, int i) {
		Person p = em.find(Person.class, i);
		em.getTransaction().begin();
		p = entity;
		em.getTransaction().commit();

	}

	public Person findById(int id) {
		Person p = em.find(Person.class, id);
		return p;
	}

	public void deleteById(int id) {
		Person p = findById(id);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

	}

	public List<Person> findAll() {

		// read the existing entries and write to console
		Query q = em.createQuery("select t from Family t");
		List<Person> personList = q.getResultList();
		return personList;

	}

}
