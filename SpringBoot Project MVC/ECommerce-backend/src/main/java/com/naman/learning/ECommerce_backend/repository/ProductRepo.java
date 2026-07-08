package com.naman.learning.ECommerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naman.learning.ECommerce_backend.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
