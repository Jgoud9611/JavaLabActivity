package com.pmgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmgnt.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
