package com.camera.projectcamera.responsentory;

import com.camera.projectcamera.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository <Ticket, Long> {
}
