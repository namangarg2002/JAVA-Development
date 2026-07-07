package com.naman.learning.SpringBootRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naman.learning.SpringBootRestAPI.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
