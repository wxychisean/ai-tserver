package com.chisean.ai.tserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@EntityScan(basePackages="com.chisean")
@ComponentScan("com.chisean")
@SpringBootApplication
public class TserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(TserverApplication.class, args);
    }

}
