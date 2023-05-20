package com.assignment.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Entites.Book;
import com.assignment.Repo.BookRepo;
import com.assignment.Service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepo bookRepo;

	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Optional<Book> getBookById(Long id) {
		return bookRepo.findById(id);
		
	}

	@Override
	public Book updateBook(Book book, Long id) {
		book.setId(id);
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
		
	}

}
