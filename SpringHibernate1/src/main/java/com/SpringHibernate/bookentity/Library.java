package com.SpringHibernate.bookentity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library 
{
	@Id
	private int Library_Id;
	private String Library_Name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="Book_Id")
	Book boo ;
	

}