package com.jpademo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;

	private String description;

/*	@OneToMany(mappedBy = "family")
	private List<Person> members;
	
	(cascade = CascadeType.ALL)
    @JoinTable(name = "family", joinColumns = {@JoinColumn(name = "familyid", referencedColumnName = "id")},
        inverseJoinColumns = {@JoinColumn(name = "personid", referencedColumnName = "id")})
 
*/	private List<Family> families;

	public List<Family> getFamilies() {
		return families;
	}

	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

/*	public List<Person> getMembers() {
		return members;

	}

	public void setMembers(List<Person> members) {
		this.members = members;
*/	}


