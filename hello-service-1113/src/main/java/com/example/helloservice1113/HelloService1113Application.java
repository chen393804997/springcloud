package com.example.helloservice1113;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloService1113Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloService1113Application.class, args);
    }

}
