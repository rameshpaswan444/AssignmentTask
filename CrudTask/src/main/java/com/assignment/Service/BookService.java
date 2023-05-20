package com.assignment.Service;

import java.util.List;
import java.util.Optional;

import com.assignment.Entites.Book;

public interface BookService {
	
	//add book
	
	Book addBook(Book book);
	
	// get all books
	
	List<Book> getAllBooks();
	
	//getbook by id
	
	Optional<Book> getBookById(Long id);
	
	//update book
	
	Book updateBook(Book book, Long id);
	
	//delete book

	void deleteBook(Long id);
}
