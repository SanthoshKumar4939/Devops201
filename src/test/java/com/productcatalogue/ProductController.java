package com.productcatalogue;

import java.util.HashMap;
import java.util.Map;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productcatalogue.model.Product;
import com.productcatalogue.service.impl.ProductServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductController.class)
public class ProductController {

	@Autowired
	private MockMvc mockmvc;
	@Autowired
	private ProductServiceImpl productService;
	@Autowired
	private ObjectMapper objectMapper;
	
	public void addProduct() {
		Map<String, Object> productlist=new HashMap<String, Object>();
		productlist.put("productName", "Shirt");
		productlist.put("brand", "Adidas");
		productlist.put("price", 1034);
		productlist.put("color", "red");
		productlist.put("size", 43);
		productlist.put("sku", "iryghjg");
		productlist.put("quantity", 10);
		
	}
	
}
