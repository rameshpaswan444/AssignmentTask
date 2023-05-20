package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Entites.Person;
import com.assignment.Repo.PersonRepo;
import com.assignment.Service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepo personRepo;

	@Override
	public Person addPerson(Person person) {
		return personRepo.save(person);
	}

	@Override
	public List<Person> getAllPersons() {
		return personRepo.findAll();
	}

	@Override
	public Optional<Person> getPersonById(Long id) {
		return personRepo.findById(id);
	}

	@Override
	public Person updatePerson(Person person, Long id) {
		person.setId(id);
		return personRepo.save(person);
	}

	@Override
	public void deletePerson(Long id) {
		personRepo.deleteById(id);
	}

}
