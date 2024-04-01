package com.example.product.service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService{

    @Autowired
    private ProductRepository  productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
