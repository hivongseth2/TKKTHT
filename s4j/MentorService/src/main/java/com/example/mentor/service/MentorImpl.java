package com.example.mentor.service;

import com.example.mentor.entity.Mentor;
import com.example.mentor.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@CacheConfig(cacheNames = "MentorsChace")

public class MentorImpl implements MentorService {

    @Autowired
    private MentorRepository productRepository;

    @Override
    public List<Mentor> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    @Cacheable(value = "mentorCache", key = "#id")

    public Optional<Mentor> getMentor(Long id) {
        return productRepository.findById(id);
    }
}
