package com.pmgnt.service;

import com.pmgnt.entity.Product;

public interface ProductService {
	
    Product save(Product p);
	
	void deleteProduct (int pid);
	
	Product getProductById(int productId);

	void update(Product params, int productId);


}


