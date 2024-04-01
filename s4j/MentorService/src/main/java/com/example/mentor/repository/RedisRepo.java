//package com.example.mentor.repository;
//
//import com.example.mentor.entity.Mentor;
//import org.springframework.data.redis.core.HashOperations;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import java.util.List;
//
//public class RedisRepo {
//    private HashOperations hashOperations;
//    private RedisTemplate redisTemplate;
//
//    public RedisRepo(RedisTemplate redisTemplate){
//        super();
//        this.hashOperations = redisTemplate.opsForHash();
//        this.redisTemplate = redisTemplate;
//    }
//
//
//    //Hash
//    public Mentor mentor(Mentor mentor){
//        redisTemplate.opsForHash().put("Mentor", mentor.getMentorId(), user);
//        return user;
//    }
//
//    public List<User> findAll(){
//        return redisTemplate.opsForHash().values("User");
//    }
//
//    public User findByIda(Long id){
//
//        return (User) redisTemplate.opsForHash().get("User", id);
//    }
//    public User update(User user) {
//        return save(user);
//    }
//
//    public void delete(int id) {
//        hashOperations.delete("USER", id);
//    }
//
//}
