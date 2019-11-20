package com.example.eurekaserver1112;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer1112Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1112Application.class, args);
    }

}
