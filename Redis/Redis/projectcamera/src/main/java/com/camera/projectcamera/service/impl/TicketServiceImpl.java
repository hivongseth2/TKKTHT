//package com.camera.projectcamera.service.impl;
//
//import com.camera.projectcamera.entity.Tickets;
//import com.camera.projectcamera.responsentory.TicketRepo;
//import com.camera.projectcamera.service.TicketService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
//
//@Service
//@RequiredArgsConstructor
//public class TicketServiceImpl implements TicketService {
//    private final TicketRepo TicketRepo;
//
//
//
//    @Override
//    public Tickets getTicketById(Long id) {
//        Tickets ticket = TicketRepo
//                .findById(id)
//                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Vé không được tìm thấy với id" + id));
//        return ticket;
//    }
//
//
//}
