package com.pmgnt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int productId;
	String productName;
	double productPrice;
	@Column(name="ManufactureDate")
	Date mnfDate;
	@Column(name="ExpiryDate")
	Date expDate;

}


