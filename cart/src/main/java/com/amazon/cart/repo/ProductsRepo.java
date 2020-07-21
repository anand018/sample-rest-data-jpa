package com.amazon.cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.cart.entities.ProductEntity;

@Repository
public interface ProductsRepo extends JpaRepository<ProductEntity, Integer> {

}
