package org.nokia;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


public class BookController {
	
}

/*
 * @RestController public class BookController {
 * 
 * @Autowired private BookRepository bookRepository;
 * 
 * @GetMapping("/") public String welcome() { return
 * "Welcome to Book REST API Service !!"; }
 * 
 * @GetMapping("/book") public List<Book> getBooks() { return
 * bookRepository.findAll(); }
 * 
 * @GetMapping("/book/{id}") public Book getBookById(@PathVariable("id") int id
 * ) { System.out.println("Book kID Requested => " + id); return
 * bookRepository.findById(id).get() ; }
 * 
 * 
 * @PostMapping("/book") public Book addBook(@RequestBody Book book ) { return
 * bookRepository.save(book); }
 * 
 * }
 */