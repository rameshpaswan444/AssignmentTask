package com.assignment.Service;

import java.util.List;
import java.util.Optional;

import com.assignment.Entites.Person;

public interface PersonService {
	
	// add person
	
	Person addPerson(Person person);
	
	//get all persons
	
	List<Person> getAllPersons();
	
	//get person by id
	
	Optional<Person> getPersonById(Long id);
	
	//update person
	
	Person updatePerson(Person person, Long id);
	
	//delete person
	
	void deletePerson(Long id);

}
