package com.example.student.Service;

import com.example.student.Entity.Student;
import com.example.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Optional<Student> getStudent(Long id) {
        return studentRepo.findById(id);

    }
}
