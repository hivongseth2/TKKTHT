package com.example.redis.repository;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.redis.entity.*;

import java.util.List;

@Repository
public class UserRepository {
    private HashOperations hashOperations;
    private RedisTemplate redisTemplate;

    public UserRepository(RedisTemplate redisTemplate){
        super();
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }


    //Hash
    public User save(User user){
        redisTemplate.opsForHash().put("User", user.getId(), user);
        return user;
    }

    public List<User> findAll(){
        return redisTemplate.opsForHash().values("User");
    }

    public User findByIda(Integer id){

        return (User) redisTemplate.opsForHash().get("User", id);
    }
    public void update(User user) {
        save(user);
    }

    public void delete(int id) {
        hashOperations.delete("USER", id);
    }

}
