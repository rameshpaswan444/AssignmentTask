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
import com.assignment.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//add books
	
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		bookService.addBook(book);
		
		return ResponseEntity.ok(book);
	}
	
	//get all books
	
	@GetMapping("/get")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> book = bookService.getAllBooks();
		return ResponseEntity.ok(book);
	}
	
	//get book by id
	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable("id") Long id){
		
		return bookService.getBookById(id);
	
	}
	//update book
	@PutMapping("/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable("id") Long id) {
		return bookService.updateBook(book, id);
		
	}
	
	//delete book
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable("id") Long id) {
		
		bookService.deleteBook(id);
	}
	
	

}
