package com.example.spring_boot_api_jwt_ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
public class SpringBootApiJwtAdApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApiJwtAdApplication.class, args);
    }

}
