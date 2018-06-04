package com.jsj.dubbo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");

        SpringApplication.run(ClientApplication.class, args);
    }
}
