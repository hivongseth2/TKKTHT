package com.example.spring_boot_api_jwt_ad.RedisRepo;

import com.example.spring_boot_api_jwt_ad.entity.Post;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Cacheable
public class RedisRepoPost {
    private HashOperations<String, Long, Post> hashOperations;
    private RedisTemplate<String,Post> redisTemplate;

    public RedisRepoPost (RedisTemplate redisTemplate)
    {
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }

    public void savePostRedis(Post post)
    {
        hashOperations.put("POST", post.getId(),post);
    }
    public List<Post> findAll()
    {
        return hashOperations.values("POST");
    }


}
