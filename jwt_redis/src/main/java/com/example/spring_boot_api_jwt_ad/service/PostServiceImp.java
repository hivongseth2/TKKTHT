package com.example.spring_boot_api_jwt_ad.service;

import com.example.spring_boot_api_jwt_ad.entity.Post;
import com.example.spring_boot_api_jwt_ad.repository.PostReposentory;
import com.example.spring_boot_api_jwt_ad.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PostServiceImp implements PostService{
    @Autowired
    private PostReposentory postReposentory;

    @Override
    public Post createPost(Post post) {


       return postReposentory.saveAndFlush(post);
    }
}
