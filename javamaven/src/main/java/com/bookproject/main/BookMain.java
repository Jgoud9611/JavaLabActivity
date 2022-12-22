package com.bookproject.main;

import java.sql.SQLException;

import com.bookproject.daoimpl.BookDAOImpl;
import com.bookproject.dbconfig.DBConfig;
import com.bookproject.entity.Book;

public class BookMain {

	public static void main(String[] args) throws SQLException {
		BookDAOImpl bdao=new BookDAOImpl();
		DBConfig.makeConnection();
		bdao.createBookTable();
		System.out.println("inserting into book table");
Book b1=new Book(01,"Java prograBookmming","balaguruswamy","features of java,exceptions,threads",450,"https://java;");
 Book b2=new Book(02,"Puzzels","satish","logical puzzels,number puzzels",450,"https://puzzels;");
Book  b3=new Book(03,"English","Marry com","Grammer,poems,lessons",350,"https://English");
bdao.insertBook(b1);
bdao.insertBook(b2);
bdao.insertBook(b3);
bdao.updateBookName();
bdao.retriveBookDetails();
bdao.deleteBookDetails();
bdao.listOfBooksByPrice();

	}

	
	

	}
