package com.example.redis.controller;


import com.example.redis.entity.*;
import com.example.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class UserController {

    //redis
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/create")
    public User saveEmp(@RequestBody User user){
        userRepository.save(user);
        return user;
    }

    @GetMapping("/list")
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @GetMapping
    public String abc(){
        return "abc";
    }

}
