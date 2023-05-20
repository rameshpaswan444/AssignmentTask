package com.assignment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entites.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
