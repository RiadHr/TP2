package com.example.msbourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsBourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBourseApplication.class, args);
    }

}
