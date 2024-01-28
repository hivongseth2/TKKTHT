package com.camera.projectcamera.Controllers;

import com.camera.projectcamera.entity.Product;
import com.camera.projectcamera.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest")
@RequiredArgsConstructor

public class RestControler {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProductService productService;


    @GetMapping("/user")
    public Object getForObject() {
        String apiUrl = "http://localhost:8081/user";
        return restTemplate.getForObject(apiUrl, Object.class);
    }

    @GetMapping("/productUser")
    public Map<String, Object> getForObjectAndUser() {
        String apiUrl = "http://localhost:8081/user/get?userId=1";
       Object user =  restTemplate.getForObject(apiUrl, Object.class);
       Product product = productService.getProductById(1L);
        Map<String, Object> result = new HashMap<>();

        result.put("user", user);
        result.put("product", product);

        return result;



    }
}
