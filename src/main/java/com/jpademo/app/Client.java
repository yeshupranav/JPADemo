package com.jpademo.app;

import java.util.ArrayList;
import java.util.List;

import com.jpademo.dao.FamilyDaoImpl;
import com.jpademo.dao.PersonDaoImpl;
import com.jpademo.entity.Family;
import com.jpademo.entity.Person;

public class Client {
	public static void main(String[] args) {

		PersonDaoImpl persondao = new PersonDaoImpl();
		FamilyDaoImpl fdao = new FamilyDaoImpl();

		List<Person> personList = new ArrayList<Person>();
		Family family = new Family();
		Person p3 = new Person();
		p3.setFirstName("Frans3");
		p3.setLastName("Rao3");
		p3.setNonsenseField("Hello");
		p3.setPersons(personList);
		p3.setFamily(family);
		p3.setPersons(personList);

		persondao.persist(p3);

		Person p1 = new Person();
		p1.setFirstName("Frans1");
		p1.setLastName("Rao1");
		p1.setNonsenseField("Hello");
		p1.setFamily(family);
		p1.setPersons(personList);
		p1.setFamily(family);
		p1.setPersons(personList);

		persondao.persist(p1);

		Person p2 = new Person();
		p2.setFirstName("Frans");
		p2.setLastName("Rao");
		p2.setNonsenseField("Hello");
		p2.setFamily(family);
		p2.setPersons(personList);
		p2.setFamily(family);
		p2.setPersons(personList);

		persondao.persist(p2);

		personList.add(p1);
		personList.add(p2);
		personList.add(p3);

		List<Family> familyList = new ArrayList<Family>();
		Family family1 = new Family();
		family.setDescription("New Family");
		family.setFamilies(familyList);

		// Save the data
		family1.setDescription("Good family");
		//family1.setMembers(personList);
		family1.setFamilies(familyList);

		// Update the List

		persondao.update(p1, 1);
		System.out.println("personlist after updation" + family1);
		System.out.println(family1.toString());

		// Delete the data

		// fdao.deleteById((int) 1);

	}
}

/*
 * .setSummary("This is a test"); todo.setDescription("This is a test");
 */

/*
 * private static final String PERSISTENCE_UNIT_NAME = "todos"; private static
 * EntityManagerFactory factory =
 * Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
 * 
 * public static void main(String[] args) {
 * 
 * EntityManager em = factory.createEntityManager();
 * em.getTransaction().begin();
 * 
 * // Create Family Entity Family fm = new Family(); // fm.setId(1);
 * fm.setDescription("Good Family"); em.persist(fm);
 * 
 * // Create Person Entity Person p = new Person(); // p.setId("1");
 * p.setFirstName("Frans"); p.setLastName("Crak"); p.setFamily(fm);
 * 
 * //p.setId("2"); p.setFirstName("Sam"); p.setLastName("Sri"); p.setFamily(fm);
 * 
 * // p.setId("3"); p.setFirstName("John"); p.setLastName("Rid");
 * p.setFamily(fm);
 * 
 * em.persist(fm); em.persist(p); em.getTransaction().commit(); em.close();
 * //factory.close();
 * 
 * } }
 */