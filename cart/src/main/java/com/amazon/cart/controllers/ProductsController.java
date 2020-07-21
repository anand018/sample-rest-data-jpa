package com.amazon.cart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.cart.dto.Product;
import com.amazon.cart.services.ProductService;

@RestController
public class ProductsController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/add-products", method = RequestMethod.POST)
	public void addProducts(@RequestBody List<Product> products) {

		productService.addProducts(products);

	}

}
