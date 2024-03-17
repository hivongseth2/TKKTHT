package com.example.spring_boot_api_jwt_ad.repository;

import com.example.spring_boot_api_jwt_ad.entity.Post;
import com.example.spring_boot_api_jwt_ad.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostReposentory extends JpaRepository<Post, Long> {
//    Post addPost(Post post);
}
