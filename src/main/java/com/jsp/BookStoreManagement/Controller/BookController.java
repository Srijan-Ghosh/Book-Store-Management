package com.jsp.BookStoreManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.BookStoreManagement.Dto.Book;
import com.jsp.BookStoreManagement.Service.BookService;

@RestController  //@Controller + @ResponseBody
public class BookController {
	
	@Autowired
	BookService service;
	
	//REST API TO INSERT BOOK OBJECTS FROM DB
	@PostMapping("/book")
	public String addBookInfo(@RequestBody Book book)
	{
	  return service.createBook(book);
	}
	
	//REST API TO RETREIVE ALL BOOK OBJECTS FROM DB
	@GetMapping("/book")
	public List<Book> getAllBooks()
	{
		return service.fetchAllBooks();
	}

	//REST API TO RETRIEVE A SPECIFIC BOOK OBJECT FROM DB
	@GetMapping("/byid")
	public Book getBookById(@RequestParam int id)
	{
       		return service.findBookById(id);
	}
	
	@PutMapping("/book")
	public String updateBook(
	    @RequestParam int id,
	    @RequestParam String title,
	    @RequestParam String author,
	    @RequestParam String publisher,
	    @RequestParam double price,
	    @RequestParam int quantity,
	    @RequestParam String published_date
	) {
	    return service.updateBook(id, title, author, publisher, price, quantity, published_date);
	}

	
	//REST API TO DELETE A BOOK OBJECT FROM DB
	@DeleteMapping("/book")
	public String deleteBookById(@RequestParam int id)
	{
		return service.deleteBookById(id);
	}
	
	//REST API TO GET ALL BOOk BASED ON TITLE
	@GetMapping("/bytitle")
	public Book getBookByTitle(@RequestParam String title){
		return service.findBookByTitle(title);
	}
	
	//REST API TO RETREIVE ALL BOOK WHOSE PRICE>150
	@GetMapping("/bookprice")
	public List<Book> getAllBooksByPrice(@RequestParam double price)
	{
		return service.fetchAllBooksByPrice(price);
	}
	


	

	

}
