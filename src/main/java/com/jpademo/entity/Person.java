package com.jpademo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Family_ID")
	private Family family;

	private String nonsenseField = "";
	@ManyToMany(mappedBy = "persons")
	private List<Person> persons;

	// private List<Job> jobList = new ArrayList<Job>();

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@ManyToOne

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	@Transient
	public String getNonsenseField() {
		return nonsenseField;
	}

	public void setNonsenseField(String nonsenseField) {
		this.nonsenseField = nonsenseField;
	}

	@OneToMany

	/*
	 * public List<Job> getJobList() { return jobList; }
	 * 
	 * public void setJobList(List<Job> jobList) { this.jobList = jobList; }
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}