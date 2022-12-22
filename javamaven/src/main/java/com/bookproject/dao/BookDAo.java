package com.bookproject.dao;

import java.sql.SQLException;

import com.bookproject.entity.Book;

public interface BookDAO {
	void createBookTable();
	boolean insertBook(Book b);
	void retriveBookDetails();
	int updateBookName() throws SQLException;
	void deleteBookDetails();
	void listOfBooksByPrice();
	

}
