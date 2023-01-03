package com.studentinformation;

import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentMain {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure("hibernateconfigure.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Student22Batch std=new Student22Batch();
		std.setRoll_num(101);
		std.setStud_name("jagadish");
		std.setStud_dob("01-12-1999");
		std.setStud_doj("01-06-2022");
		std.setBranch("Mechanic");
		
		Student22Batch std1=new Student22Batch(102,"avinash","05-03-2000","01-06-2022","Electronics");
		Student22Batch std2=new Student22Batch(103,"Anil","01-10-1997","01-06-2022","Visual-communication");
		Student22Batch std3=new Student22Batch(104,"Bhargav","02-01-1998","01-06-2022","Computer-Science");
		Student22Batch std4=new Student22Batch(105,"Vineeth","06-07-2001","01-06-2022","Mechtronics");
		
		session.save(std4);
		session.save(std3);
		session.save(std2);
		session.save(std1);
		session.save(std);
		
		session.getTransaction().commit();

		System.out.println("1.View All Student Details || 2.update student name");
		System.out.println("3.Delete student details   || 4.view Specific student details");
		
		int option;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				try
				{
					Query query01=session.createQuery("from Student22Batch");
					List list=query01.list();
					System.out.println(list);
					
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
			case 2:
				try
				{
					session.beginTransaction();
					Query query02=session.createQuery("update Student22Batch set stud_name='Pavan' where id='102'");
					int list02=query02.executeUpdate();
					System.out.println("Row are updated"+list02);
					session.getTransaction().commit();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 3:
				try
				{
					int stdnum;
					System.out.println("Enter the roll num");
					stdnum=sc.nextInt();
					session.beginTransaction();
					Query query03=session.createQuery("delete from Student22Batch where id="+stdnum );
					int list03=query03.executeUpdate();
					session.getTransaction().commit();

				
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 4:
				try
				{
					int stdid;
					System.out.println("Enter the roll num");
					stdid=sc.nextInt();
					session.beginTransaction();
					Query query04=session.createQuery(" from Student22Batch where id="+stdid);
					List list=query04.list();
					System.out.println(list);
					session.getTransaction().commit();
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			case 5:
				try
				{
		
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}