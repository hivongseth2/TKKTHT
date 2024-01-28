package com.camera.projectcamera.service;

import com.camera.projectcamera.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product create(String name);
    Product getProductById(Long id);
//    void update(Long id, String name);

    List <Product> getAllProduct();

   Product updateProduct (Long roleId, String name);
}
