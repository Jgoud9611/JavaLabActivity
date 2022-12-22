package com.bookproject.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bookproject.dao.BookDAO;
import com.bookproject.dbconfig.DBConfig;
import com.bookproject.entity.Book;

public class BookDAOImpl implements BookDAO{
	static Connection con;
	static 
	{
		try
		{
			DBConfig.makeConnection();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	//To create book Details
	public void createBookTable()
	{
			try 
			{
				Statement st=con.createStatement();
				st.executeUpdate("create table book(book_id int primary key,book_name varchar(20),authors varchar(40),description varchar(50),price int,URL varchar(30))");
				System.out.println("Book table created successfully");
			}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			
	}
	//To insert Values into Book Table
	public boolean insertBook(Book b) {
		boolean a = false;
		try 
		{  
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?,?,?)");
			ps.setInt(1,b.getBookId());
			ps.setString(2,b.getBookName());
			ps.setString(3,b.getAuthors());
			ps.setString(4,b.getDescription());
			ps.setInt(5,b.getBookPrice());
			ps.setString(6,b.getURLofBook());
			int rowsAffected=ps.executeUpdate();
			if(rowsAffected>0) {
				a=true;
				con.commit();
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return a;
		
	}
	//To retrive All Book details
	public void retriveBookDetails()
	{
		try 
		{
			PreparedStatement ps=con.prepareStatement("select * from Book");
			ResultSet rs=ps.executeQuery();
			System.out.println("Details of Book table is:");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	//To update book name
	public int updateBookName() throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("update book set book_name='puzzels' where book_id=2");
		int rowsUpdated=ps.executeUpdate();
		System.out.println("No of rows updated is:"+rowsUpdated);
		return rowsUpdated;
		
	}
	//To delete book details by book id
	public void deleteBookDetails()
	{
		try 
		{
			PreparedStatement ps=con.prepareStatement("delete from book where book_id=01");
			ps.executeUpdate();
			System.out.println("Deleted successfully");
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}
	//To show list of books by price
	public void listOfBooksByPrice() 
	{
		try 
		{
			PreparedStatement ps=con.prepareStatement("select book_name,price from book where price=450");
			ResultSet rs=ps.executeQuery();
			System.out.println("list of books by price are :");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
		
	}