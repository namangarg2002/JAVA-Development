package com.naman.learning.SpringBootRestAPI.service;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naman.learning.SpringBootRestAPI.model.Product;
import com.naman.learning.SpringBootRestAPI.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = 
    //     new ArrayList<>(
    //         Arrays.asList(new Product(101, "Iphone", 50000), 
    //                   new Product(102, "Canon Camera", 70000),
    //                   new Product(103, "Shure mic", 10000)
    //                 )
    //     );  
    
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deletePrododuct(int prodId) {
        repo.deleteById(prodId);
    }
}
