package com.productcatalogue.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalogue.model.Product;
import com.productcatalogue.service.impl.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@PostMapping("/product")
	public ResponseEntity<?> addProduct(@RequestBody Map<String, Object> data){
		Product product=productServiceImpl.addProduct(data);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
		
	}
	@GetMapping("/product")
	public ResponseEntity<?> getProducts(){
		return new ResponseEntity<List<Product>>(productServiceImpl.getallProduct(),HttpStatus.OK);
		
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<?> getProductbyId(@PathVariable Long id){
		return new ResponseEntity<Product>(productServiceImpl.getProductById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<?> deleteProductbyId(@PathVariable Long id){
		return new ResponseEntity<String>(productServiceImpl.deleteById(id),HttpStatus.OK);
	}
	
	@GetMapping("/product/search/{sku}")
	public ResponseEntity<?> getBySku(@PathVariable String sku){
		
		return new ResponseEntity<List<Product>>(productServiceImpl.getbySku(sku),HttpStatus.OK);
	}
	@GetMapping("/product/group/{groupBy}")
	public ResponseEntity<?> getBygroup(@PathVariable String groupBy){
		
		
		return new ResponseEntity<List<Product>>(productServiceImpl.groupby(groupBy),HttpStatus.OK);
	}

}
