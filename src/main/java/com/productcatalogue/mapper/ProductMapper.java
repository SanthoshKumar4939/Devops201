package com.productcatalogue.mapper;

import java.util.Map;

import com.productcatalogue.builder.ProductBuilder;
import com.productcatalogue.model.Product;

public class ProductMapper {
	
	public static Product productMapper(Map<String,Object> data) {
		 String productName=data.get("productName").toString();
		 String brand=data.get("brand").toString();
		 Double price=Double.parseDouble(data.get("price").toString());
		 String color=data.get("color").toString();
		 Integer size=Integer.parseInt(data.get("size").toString());
		 String sku=data.get("sku").toString();
		 Integer quantity=Integer.parseInt(data.get("quantity").toString());
		 ProductBuilder productbuilder=new ProductBuilder();
		 
		 return productbuilder.setBrand(brand).setColor(color).setPrice(price)
				 .setProductName(productName).setQuantity(quantity).setSize(size)
				 .setSku(sku).productBuild();
		 
	}

}
