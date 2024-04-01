package com.example.student.controller;

import com.example.student.Entity.Student;
import com.example.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/get")
    public ResponseEntity<Object> getStudentAndProduct() {
        Optional<Student> studentOptional = studentService.getStudent(1L);

        if (studentOptional.isPresent()) {
            String mentorUrl = "http://localhost:8085/mentor/findById?id=1";
            ResponseEntity<Object> mentorResponse = restTemplate.exchange(
                    mentorUrl,
                    HttpMethod.GET,
                    null,
                    Object.class
            );

            Object mentor = mentorResponse.getBody();

            Map<String, Object> result = new HashMap<>();
            result.put("student", studentOptional.get());
            result.put("mentor", mentor);

            return ResponseEntity.ok().body(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
