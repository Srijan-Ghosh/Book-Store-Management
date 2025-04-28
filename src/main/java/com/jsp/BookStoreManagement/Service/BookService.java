package com.jsp.BookStoreManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.BookStoreManagement.Dto.Book;
import com.jsp.BookStoreManagement.Repository.BookRepository;


@Service
public class BookService {
	
   @Autowired
   BookRepository repository;
   
   
   // REST API TO STORE BOOK OBJECT INTO DB
   public String createBook(Book book)
   {
	   repository.save(book);
	   return "Book details are stored successfully...";
   }
   
   // to retrieve all Book objects from DB
   public List<Book> fetchAllBooks()
   {
	   return repository.findAll();
   }
   
   // to search for an object based on ID
   public Book findBookById(int id)
   {
	  Optional<Book> opt=repository.findById(id);
	  if(opt.isPresent())
	  {
		  return opt.get();
	  }
	  else
	  {
		  return null;
	  }
   }
   
   
   
   // to delete a weather object from DB
   public String deleteBookById(int id)
   {
	   Book book=findBookById(id);
	   if(book!=null)
	   {
		   repository.delete(book); //OR repository.deleteById(id);
		   return "Book with ID:"+id+" is deleted successfully";
	   }
	   else {
		   return "Book with ID:"+id+" doesn't exist";
	   }
   }
   
   // to update Weather details( temperature and condition) in DB based in ID
   public String updateBook(int id, String newTitle, String newAuthor, String newPublisher, double newPrice, int newQuantity, String newPublished_date)
   {
	   Book book=findBookById(id);
	   if(book!=null) {
		   book.setTitle(newTitle);
		   book.setPublisher(newPublisher);
		   book.setAuthor(newAuthor);
		   book.setPrice(newPrice);
		   book.setQuantity(newQuantity);
		   book.setPublished_date(newPublished_date);
		   repository.save(book);
		   return "Updated succlessfully.";
	   } else {
		   return null;
	   }
   }
   
   // to fetch weather reports based on city
   public Book findBookByTitle(String title)
   {
	   return repository.findByTitle(title);
   }
   
   public List<Book> fetchAllBooksByPrice(double price)
   {
	  List<Book> opt=repository.findByPrice(price);
	  if(opt!=null)
	  {
		  return opt;
	  }
	  else
	  {
		  return null;
	  }
   }
   
}
