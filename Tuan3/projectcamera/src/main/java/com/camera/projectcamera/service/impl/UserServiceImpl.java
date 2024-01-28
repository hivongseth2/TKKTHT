package com.camera.projectcamera.service.impl;

import com.camera.projectcamera.entity.User;
import com.camera.projectcamera.responsentory.RoleRepo;
import com.camera.projectcamera.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final RoleRepo userRepository;

    @Override
    public User create(String name) {
        User user = new User();
        user.setUserName(name);

        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Mặt hàng không được tìm thấy với id" + id));
        return user;
    }

    @Override
    public List<User> getAllUser() {
       return userRepository.findAll();
    }

    @Override
    public User updateUser(Long userId, String name) {
        Optional<User> optionalRole = userRepository.findById(userId);

        if (optionalRole.isPresent()) {
            User user = optionalRole.get();
            user.setUserName(name);

            return userRepository.save(user);
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
