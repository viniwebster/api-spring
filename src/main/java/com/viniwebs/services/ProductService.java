package com.viniwebs.services;

import com.viniwebs.entities.Category;
import com.viniwebs.entities.Product;
import com.viniwebs.repositories.CategoryRepository;
import com.viniwebs.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }
}
