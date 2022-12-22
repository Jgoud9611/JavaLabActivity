package com.bookproject.entity;

public class Book {
	int bookId;
	String bookName;
	String authors;
	String description;
	int bookPrice;
	String URLofBook;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getURLofBook() {
		return URLofBook;
	}
	public void setURLofBook(String uRLofBook) {
		URLofBook = uRLofBook;
	}
	public Book() {
		super();
		
	}
	public Book(int bookId, String bookName, String authors, String description, int bookPrice, String uRLofBook) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authors = authors;
		this.description = description;
		this.bookPrice = bookPrice;
		URLofBook = uRLofBook;
	}
	
	

}