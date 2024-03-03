package com.camera.projectcamera.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "tickets")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Tickets implements Serializable {
    @Id
    private Long orderId;

    @Column(name = "tickets_type")
    private String ticketType;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name="price")
    private Long price;

    @Column(name="time")
    private Date time;
}
