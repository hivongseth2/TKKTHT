package com.camera.projectcamera.Controllers;

import com.camera.projectcamera.entity.Order;
import com.camera.projectcamera.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    @Autowired
    private final OrderService orderService;


    @GetMapping("/get")
    public Order getOrderById(@RequestParam Long orderId) {

        return orderService.getOrderById(orderId);
    }
}
