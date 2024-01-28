package com.camera.projectcamera.Controllers;

import com.camera.projectcamera.entity.User;
import com.camera.projectcamera.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;



    @GetMapping("/get")
    public User getUser(@RequestParam Long userId) {



        return userService.getUserById(userId);
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
