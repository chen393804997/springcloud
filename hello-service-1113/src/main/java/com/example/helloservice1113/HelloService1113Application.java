package com.example.helloservice1113;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloService1113Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloService1113Application.class, args);
    }

}
