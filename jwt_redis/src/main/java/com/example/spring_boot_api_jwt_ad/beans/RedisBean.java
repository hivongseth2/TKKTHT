package com.example.spring_boot_api_jwt_ad.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration

public class RedisBean {
    @Bean
    LettuceConnectionFactory jedisConnectionFactory()
    {
        return new LettuceConnectionFactory();
    }

    @Bean
    RedisTemplate redisTemplate()
    {
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
}
