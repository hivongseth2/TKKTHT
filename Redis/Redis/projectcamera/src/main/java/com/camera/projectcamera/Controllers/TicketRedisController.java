package com.camera.projectcamera.Controllers;

import com.camera.projectcamera.entity.Tickets;
import com.camera.projectcamera.responsentory.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TicketRedisController {
    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/ticket")
    public Tickets saveTicket(@RequestBody Tickets ticket)
    {
        ticketRepository.saveTicket(ticket);
        return ticket;
    }

    @GetMapping("/ticket/{id}")
    public Tickets findById(@PathVariable("id") Long id)
    {
        return ticketRepository.findById(id);
    }

    @GetMapping("/tickets")
    public List<Tickets> findAll()
    {
        return ticketRepository.findAll();
    }
    @PutMapping("/employee")
    public void update(@RequestBody Tickets ticket)
    {
        ticketRepository.update(ticket);
    }
    @DeleteMapping("/ticket/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        ticketRepository.delete(id);
    }

}
