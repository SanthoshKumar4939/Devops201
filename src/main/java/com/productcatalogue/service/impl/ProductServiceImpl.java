package com.productcatalogue.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalogue.mapper.ProductMapper;
import com.productcatalogue.model.Product;
import com.productcatalogue.repository.ProductRepository;
import com.productcatalogue.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Override
	public Product addProduct(Map<String, Object> data) {
		// TODO Auto-generated method stub
		Product product=ProductMapper.productMapper(data);
		return productRepository.save(product);
	}
	@Override
	public List<Product> getallProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}
	@Override
	public String deleteById(Long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);;
		return "Deleted Successfully";
	}
	@Override
	public List<Product> getbySku(String sku) {
		// TODO Auto-generated method stub
		return productRepository.findBySku(sku);
		
	}
	
	public List<Product> groupby(String value){
		List<Product> productlist=productRepository.findAll();
	
		if(value.toLowerCase().equals("brand")) {
			Comparator<Product> comparablebyBrand=(Product p1,Product p2)->
			p1.getBrand().compareTo(p2.getBrand());
			Collections.sort(productlist, comparablebyBrand);
		}
		else if(value.toLowerCase().equals("price")) {
			Comparator<Product> comparablebyPrice=(Product p1,Product p2)->
			Double.compare(p1.getPrice(), p2.getPrice());
			Collections.sort(productlist, comparablebyPrice);
		}
		else if(value.toLowerCase().equals("color")) {
			Comparator<Product> comparablebycolor=(Product p1,Product p2)->
			p1.getColor().compareTo(p2.getColor());
			Collections.sort(productlist, comparablebycolor);
		}
		else if(value.toLowerCase().equals("size")) {
			Comparator<Product> comparablebysize=(Product p1,Product p2)->
			Integer.compare(p1.getSize(), p2.getSize());
			Collections.sort(productlist, comparablebysize);
		}
		return productlist;
	}
	


}
