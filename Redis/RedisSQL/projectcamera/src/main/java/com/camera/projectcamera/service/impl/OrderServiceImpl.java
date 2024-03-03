//package com.camera.projectcamera.service.impl;
//
//import com.camera.projectcamera.entity.Order;
//import com.camera.projectcamera.responsentory.OrderRepo;
//import com.camera.projectcamera.service.OrderService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//@Service
//@RequiredArgsConstructor
//public class OrderServiceImpl implements OrderService {
//    private final OrderRepo orderRepository;
//
//
//    @Override
//    public Order getOrderById(Long id) {
//        Order order = orderRepository
//                .findById(id)
//                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Mặt hàng không được tìm thấy với id" + id));
//        return order;
//    }
//
//
//}
