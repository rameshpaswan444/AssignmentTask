package com.assignment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Entites.Book;
import com.assignment.Entites.Person;
import com.assignment.Service.BookService;
import com.assignment.Service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	//add person
	
	@PostMapping("/add")
	public ResponseEntity<Person> addPerson(@RequestBody Person person)
	{
		personService.addPerson(person);
		
		return ResponseEntity.ok(person);
	}
	
	//get all person
	
	@GetMapping("/get")
	public ResponseEntity<List<Person>> getAllPersons(){
		List<Person> person = personService.getAllPersons();
		return ResponseEntity.ok(person);
	}
	
	//get person by id
	@GetMapping("/{id}")
	public Optional<Person> getBookById(@PathVariable("id") Long id){
		
		return personService.getPersonById(id);
	
	}
	//update person
	@PutMapping("/{id}")
	public Person updateBook(@RequestBody Person person, @PathVariable("id") Long id) {
		return personService.updatePerson(person, id);
		
	}
	
	//delete person
	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable("id") Long id) {
		
		personService.deletePerson(id);
	}

}
