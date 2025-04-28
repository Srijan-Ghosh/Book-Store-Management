package com.jsp.BookStoreManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.BookStoreManagement.Dto.Book;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book, Integer>  // spring automatically implements required methods during runtime without manually writing.
{
   //save(book)-->called
	//it has inherited methods to perform CRUD Operations
	
	@Query("select b from Book b where b.title=?1")
	public Book findByTitle(String title);
	
	@Query(value="select * from Book where price>=?1", nativeQuery=true)
	public List<Book> findByPrice(double price);
	
	
	@Modifying
	@Transactional
	@Query("UPDATE Book b SET b.title = ?2, b.publisher = ?3, b.price = ?4, b.quantity = ?5 WHERE b.id = ?1")
	int updateBookById(int id, String title, String publisher, double price, int quantity);

}
