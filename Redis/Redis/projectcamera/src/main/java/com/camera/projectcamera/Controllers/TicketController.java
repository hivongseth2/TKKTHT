//package com.camera.projectcamera.Controllers;
//
//import com.camera.projectcamera.entity.Tickets;
//import com.camera.projectcamera.service.TicketService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/ticket")
//@RequiredArgsConstructor
//public class TicketController {
//    @Autowired
//    private final TicketService ticketService;
//
//
//    @GetMapping("/get")
//    public Tickets getOrderById(@RequestParam Long Id) {
//
//        return ticketService.getTicketById(Id);
//    }
//}
