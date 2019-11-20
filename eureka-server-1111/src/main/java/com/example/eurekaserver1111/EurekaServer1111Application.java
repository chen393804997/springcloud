package com.example.eurekaserver1111;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer1111Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1111Application.class, args);
    }

}
