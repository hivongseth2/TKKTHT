package com.example.mentor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Mentor {
    @GeneratedValue
    @Id
    private long mentorId;

    @Column
    private String name;
    @Column
    private String address;


}
