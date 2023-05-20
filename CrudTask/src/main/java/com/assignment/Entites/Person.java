package com.assignment.Entites;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String personName;
	private String personAddress;
	private String qualification;
	
@OneToMany
	private List<Book> book=new ArrayList<>();
	
@OneToMany
	private List<Vechicle> vechicle=new ArrayList<>();
	
	
	
	


	public Person(long id, String personName, String personAddress, String qualification, List<Book> book,
		List<Vechicle> vechicle) {
	super();
	this.id = id;
	this.personName = personName;
	this.personAddress = personAddress;
	this.qualification = qualification;
	this.book = book;
	this.vechicle = vechicle;
}

	public List<Book> getBook() {
	return book;
}

public void setBook(List<Book> book) {
	this.book = book;
}

public List<Vechicle> getVechicle() {
	return vechicle;
}

public void setVechicle(List<Vechicle> vechicle) {
	this.vechicle = vechicle;
}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	

	

	public Person(long id, String personName, String personAddress, String qualification) {
		super();
		this.id = id;
		this.personName = personName;
		this.personAddress = personAddress;
		this.qualification = qualification;
		
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
