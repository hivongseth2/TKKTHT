package com.camera.projectcamera.service;

import com.camera.projectcamera.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    Order getOrderById(Long id);
//    void update(Long id, String name);

}
