package com.productcatalogue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.productcatalogue.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query("from Product where sku LIKE %?1%")
	List<Product> findBySku(String sku);
	
	
}
