package com.productcatalogue.service;

import java.util.List;
import java.util.Map;

import com.productcatalogue.model.Product;

public interface ProductService {

	public Product addProduct(Map<String, Object> data); 
	public List<Product> getallProduct();
	public Product getProductById(Long id);
	public String deleteById(Long id);
	public List<Product> getbySku(String sku);
}
