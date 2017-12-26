package com.domain.tellurion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TellurionApplication {

    public static void main(String[] args) {

        SpringApplication.run(TellurionApplication.class, args);
    }
}
