package com.example.spring_boot_api_jwt_ad.controller;

import com.example.spring_boot_api_jwt_ad.DTO.PostDTO;
import com.example.spring_boot_api_jwt_ad.RedisRepo.RedisRepoPost;
import com.example.spring_boot_api_jwt_ad.entity.Post;
import com.example.spring_boot_api_jwt_ad.entity.User;
import com.example.spring_boot_api_jwt_ad.service.PostService;
import com.example.spring_boot_api_jwt_ad.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class postController {
    @Autowired
    private PostService postService;

    @Autowired
    RedisRepoPost redisRepo;
    @GetMapping
    public ResponseEntity<?> test(){
        Long userId = Auth.getUserId();

        return ResponseEntity.ok("ok");
    }


    @PostMapping("/createPost")
    public ResponseEntity<?> createPost(@RequestBody PostDTO postRequest) {
        Long userId = Auth.getUserId(); // Xác định userId từ token

        // Tạo một đối tượng Post
        Post post = new Post();
        post.setTitle(postRequest.title);
        post.setDescription(postRequest.des);

        // Đặt user cho bài đăng
        User user = new User();
        user.setId(userId);
        post.setUser(user);

        // Lưu bài đăng vào cơ sở dữ liệu
        Post savedPost = postService.createPost(post);

        return ResponseEntity.ok(savedPost);
    }


    @GetMapping("/posts")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
    public List<?> getPosts(){
        return redisRepo.findAll();
    }


}
