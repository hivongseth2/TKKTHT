package com.camera.projectcamera.Controllers;

import com.camera.projectcamera.entity.Ticket;
import com.camera.projectcamera.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {



        @Autowired
        private final TicketService ticketService;


        @GetMapping("/get")
        public List<Ticket> getAll() {

            return  ticketService.findAll();
        }

        @PostMapping("/save")
        public Ticket saveTicket(@RequestBody Ticket ticket){
           return  ticketService.saveTicket(ticket);
        }


}
