package com.camera.projectcamera.Controllers;

import com.camera.projectcamera.entity.Product;
import com.camera.projectcamera.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductService productService;


    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }


    @GetMapping("/get")
    public Product getProduct(@RequestParam Long productId) {



        return productService.getProductById(productId);
    }
}
