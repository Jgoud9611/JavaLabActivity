package com.pmgnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmgnt.entity.Product;
import com.pmgnt.serviceimp.ProductServiceImp;
@RestController
public class ProductController 
{
	@Autowired
	ProductServiceImp productSerImp;
	
	@PostMapping("/product")
	String saveProduct(@RequestBody Product product)
	{
		productSerImp.save(product);
		//return (product.getProductId()+""+product.getProductName()+""+product.getProductPrice()+""+product.getMnfDate()+""+product.getExpDate());
		return null;
	}
	
	
	@DeleteMapping("/delete/{productId}")
	void deleteProduct(@PathVariable("productId") int pid)
	{
		productSerImp.deleteProduct(pid);
		
	}

	
	@GetMapping("/product/{productId}")
	Product getProductDetails(@PathVariable("productId") int productId) 
	{
		return productSerImp.getProductById(productId);
	}


	@PutMapping("/product/{productId}")
	void update(@RequestBody Product product,@PathVariable int productId)
	{
		productSerImp.update(product, productId);
	}

}
