package com.example.mentor.service;

import com.example.mentor.entity.Mentor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MentorService {
    public List<Mentor> getAllProduct();
    public Optional<Mentor> getMentor(Long id);
}
