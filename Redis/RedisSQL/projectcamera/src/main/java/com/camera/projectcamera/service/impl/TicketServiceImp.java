package com.camera.projectcamera.service.impl;

import com.camera.projectcamera.entity.Ticket;
import com.camera.projectcamera.responsentory.TicketRepo;
import com.camera.projectcamera.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TicketServiceImp implements TicketService {

    private final TicketRepo ticketRepo;
    @Override
    public List<Ticket> findAll() {
        return ticketRepo.findAll();
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepo.save(ticket);
    }
}
