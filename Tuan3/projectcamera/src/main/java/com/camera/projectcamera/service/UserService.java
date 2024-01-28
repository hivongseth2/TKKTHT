package com.camera.projectcamera.service;

import com.camera.projectcamera.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User create(String name);
    User getUserById(Long id);
//    void update(Long id, String name);

    List <User> getAllUser();

   User updateUser(Long roleId, String name);
}
