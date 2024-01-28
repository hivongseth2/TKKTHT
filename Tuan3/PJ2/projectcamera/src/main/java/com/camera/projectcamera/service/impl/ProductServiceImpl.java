package com.camera.projectcamera.service.impl;

import com.camera.projectcamera.entity.Product;
import com.camera.projectcamera.responsentory.ProductRepo;
import com.camera.projectcamera.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepository;

    @Override
    public Product create(String name) {
        Product product = new Product();
        product.setProductName(name);

        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        Product product = productRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Mặt hàng không được tìm thấy với id" + id));
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
       return productRepository.findAll();
    }



    @Override
    public Product updateProduct(Long roleId, String name) {
        Optional<Product> optionalRole = productRepository.findById(roleId);

        if (optionalRole.isPresent()) {
            Product product = optionalRole.get();
            product.setProductName(name);
            // Perform any other update logic as needed

            // Save the updated role
            return productRepository.save(product);
        } else {
            // Role with the given ID not found
            return null;
        }
    }
//
//    @Override
//    public void update(Long id, String name) {
//        Optional<Role> roleOptional = roleRepository.findById(id);
//
//        if(roleOptional.isEmpty()){
////            throw new Bad
//        }
//    }
}
