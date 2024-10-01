package com.wk.wk_eureka;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WkEurekaApplication {

//    @Value("${sever.port}")
//    private String port;

    public static void main(String[] args) {
        SpringApplication.run(WkEurekaApplication.class, args);
    }

//    @PostConstruct
//    private void start() {
//        System.out.println("port = " + port);
//    }

}
