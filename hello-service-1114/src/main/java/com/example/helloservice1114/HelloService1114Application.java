package com.example.helloservice1114;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloService1114Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloService1114Application.class, args);
    }

}
