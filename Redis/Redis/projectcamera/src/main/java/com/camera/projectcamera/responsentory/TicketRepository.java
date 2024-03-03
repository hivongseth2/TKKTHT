package com.camera.projectcamera.responsentory;

import com.camera.projectcamera.entity.Tickets;
import jakarta.persistence.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Cacheable
public class TicketRepository {
    private HashOperations <String, Long,Tickets> hashOperations;
    private RedisTemplate <String,Tickets> redisTemplate;

    public TicketRepository (RedisTemplate redisTemplate)
    {
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }


    public void saveTicket(Tickets ticket)
    {
        hashOperations.put("TICKET", ticket.getOrderId(),ticket);
    }

    public List<Tickets> findAll()
    {
        return hashOperations.values("TICKET");
    }

    public Tickets findById(Long id)
    {
        return (Tickets) hashOperations.get("TICKET",id);
    }
    public void update(Tickets ticket)
    {
        saveTicket(ticket);
    }
    public void delete(Long id)
    {
        hashOperations.delete("TICKET",id);
    }
}
