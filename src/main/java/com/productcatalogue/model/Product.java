package com.productcatalogue.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private String brand;
	private Double price;
	private String color;
	private Integer size;
	private String sku;
	private Integer quantity;
	public Product() {
		
	}
	
	
	public Product(Long id, String productName, String brand, Double price, String color, Integer size, String sku,
			Integer quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.sku = sku;
		this.quantity = quantity;
	}


	public Product(String productName, String brand, Double price, String color, Integer size, String sku,
			Integer quantity) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.sku = sku;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
