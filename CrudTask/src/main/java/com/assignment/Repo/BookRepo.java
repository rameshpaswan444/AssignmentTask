package com.assignment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Entites.Book;

public interface BookRepo extends  JpaRepository<Book, Long>{

}
