package com.SpringHibernate.bookdao;

import com.springhibernat.bookentity.Book;

public interface BookDao {
	
	int insertBook(Book b);
	int updateBook(Book upbook);

}