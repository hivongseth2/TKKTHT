package com.camera.projectcamera.service;

import com.camera.projectcamera.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

//    void update(Long id, String name);


    List <Ticket> findAll();
    Ticket saveTicket(Ticket ticket);

}
