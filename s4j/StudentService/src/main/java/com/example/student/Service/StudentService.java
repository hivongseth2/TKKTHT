package com.example.student.Service;

import com.example.student.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public interface StudentService {

    public Optional<Student> getStudent (Long id);
}
