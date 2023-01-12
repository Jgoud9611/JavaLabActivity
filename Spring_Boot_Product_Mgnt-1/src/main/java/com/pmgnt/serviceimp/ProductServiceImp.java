package com.pmgnt.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmgnt.entity.Product;
import com.pmgnt.repository.ProductRepository;
import com.pmgnt.service.ProductService;


@Service

public class ProductServiceImp implements ProductService
{
	
	@Autowired
	ProductRepository productrepo;
	
	
	//Add the product
	@Override
	public Product save(Product p)
	{
		return productrepo.save(p);
	}

	//Delete the product
	@Override
	public void deleteProduct(int pid)
	{
		productrepo.deleteById(pid);
	}

	/*
	//Update the product
	@Override
	public void update(Product params, int productId)
	{
		Product p=productrepo.findById(productId).get();
		p.setProductName(params.getProductName());
		p.setProductPrice(params.getProductPrice());
		p.setMnfDate(params.getMnfDate());
		p.setExpDate(params.getExpDate());
		
		productrepo.save(p);
		
	}
	*/
	//Get all product Details
	@Override
	public Product getProductById(int productId) {
		return productrepo.findById(productId).get();
	}

	@Override
	public void update(Product params, int productId) {
		// TODO Auto-generated method stub
		
	}

}
