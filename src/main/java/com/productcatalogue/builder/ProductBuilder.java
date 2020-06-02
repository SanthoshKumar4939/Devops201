package com.productcatalogue.builder;

import com.productcatalogue.model.Product;

public class ProductBuilder {
	private String productName;
	private String brand;
	private Double price;
	private String color;
	private Integer size;
	private String sku;
	private Integer quantity;
	public ProductBuilder setProductName(String productName) {
		this.productName = productName;
		return this;
	}
	public ProductBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public ProductBuilder setPrice(Double price) {
		this.price = price;
		return this;
	}
	public ProductBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public ProductBuilder setSize(Integer size) {
		this.size = size;
		return this;
	}
	public ProductBuilder setSku(String sku) {
		this.sku = sku;
		return this;
	}
	public ProductBuilder setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}
	public Product productBuild() {
		Product produuct=new Product(productName, brand, price, color, size, sku, quantity);
		return produuct;
	}

}
