package com.example.helloservice1113.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    private final static Logger logger =  LoggerFactory.getLogger(HelloController.class);
    @Value("${server.port}")
    private int port;
    @RequestMapping("/hello")
    public String index(){
        logger.info("访问成功，port：{}",port);
        return "hello-"+port;
    }
}
