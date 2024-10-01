package com.wk.wk_eureka;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WkEurekaApplication.class, args);
    }

}
