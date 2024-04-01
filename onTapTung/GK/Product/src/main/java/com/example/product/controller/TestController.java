package com.example.product.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@RequestMapping("/seco")
@RestController
@RequestMapping("/products")
public class TestController {

//    @Autowired
//    GreetingClient greetingClient;


//    @GetMapping("/test")
//    public ResponseEntity<String> getTestResponse(){
//        return greetingClient.test();
//    }

//    @GetMapping("/abc")
//    public ResponseEntity<String> getABC() {
//        return ResponseEntity.ok("This is ABC");
//    }


    @GetMapping
    public String getProduct(){
        return "Product ne";
    }

    @Autowired
    ProductService productService;
    @GetMapping("/list")
    public List<Product> getList(){
        return productService.getAllProduct();
    }


}
