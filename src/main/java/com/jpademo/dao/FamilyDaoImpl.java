package com.jpademo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpademo.entity.Family;

public class FamilyDaoImpl implements FamilyDao {
	private static final String PERSISTENCE_UNIT_NAME = "todos";
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	EntityManager em = factory.createEntityManager();

	public void persist(Family entity) {
		em.getTransaction().begin();
		// em.persist(entity.getFamily());
		em.persist(entity);
		em.getTransaction().commit();

	}

	public void update(Family entity, int id) {
		Family fm = em.find(Family.class, 1);
		em.getTransaction().begin();
		fm = entity;
		em.getTransaction().commit();

	}

	public Family findById(int id) {
		Family family = em.find(Family.class, id);
		return family;
	}

	public void deleteById(int id) {
		Family family = findById(id);
		em.getTransaction().begin();
		em.remove(family);
		em.getTransaction().commit();

	}

	public List<Family> findAll() {
		Query q = em.createQuery("select t from Family t");
		List<Family> familyList = q.getResultList();
		return familyList;
	}

}
