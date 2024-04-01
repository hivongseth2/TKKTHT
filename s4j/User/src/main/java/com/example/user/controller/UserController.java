package com.example.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.user.config.RestTemplateConfig;


@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "User ne";
    }

    //rest template
    @Autowired
    private RestTemplateConfig restTemplate;

    @GetMapping("/product")
    public Object getForObjectProduct() {
            String url = "http://localhost:8085/products/list";
        return restTemplate.getForObject(url, Object.class);
    }


}
