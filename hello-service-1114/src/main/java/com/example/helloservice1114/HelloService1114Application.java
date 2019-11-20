package com.example.helloservice1114;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloService1114Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloService1114Application.class, args);
    }

}
