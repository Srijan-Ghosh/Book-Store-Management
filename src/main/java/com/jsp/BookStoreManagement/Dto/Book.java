package com.jsp.BookStoreManagement.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	private String title;
	private String author;
	private String publisher;
	private double price;
	private int quantity;
	private String published_date;
	
	
	public int getBook_id() {
		return book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	
	

}
