package com.amazon.cart.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.cart.dto.Product;
import com.amazon.cart.entities.ProductEntity;
import com.amazon.cart.repo.ProductsRepo;
import com.amazon.cart.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductsRepo productsRepo;

	@Override
	public void addProducts(List<Product> products) {

		List<ProductEntity> productEntities = convertToEntities(products);
		productsRepo.saveAll(productEntities);

	}

	private List<ProductEntity> convertToEntities(List<Product> products) {
		List<ProductEntity> entities = new ArrayList<>();

		for (Product product : products) {
			ProductEntity entity = new ProductEntity();
			entity.setCategory(product.getCategory());
			entity.setPrice(new Double(product.getPrice()));
			entity.setProductId(Integer.parseInt(product.getProductId()));
			entity.setProductName(product.getProductName());
			entity.setQuantity(Integer.parseInt(product.getQuantity()));
			entities.add(entity);
		}
		return entities;
	}
}
