package com.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	

	 Optional<Product> findById(Integer productId);
	 
	 Optional<Product> findByProductName(String productName);
	 
	 List<Product> findByProductCategory(String productCategory);
	 
	 

}
