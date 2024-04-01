package com.example.student.Entity;

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
public class Student {
    @GeneratedValue
    @Id
    private long studentId;

    @Column
    private String name;
    @Column
    private String Age;
    @Column
    private String mentorId;

}
