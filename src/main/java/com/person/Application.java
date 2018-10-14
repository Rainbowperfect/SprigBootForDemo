package com.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @version 1.0
 * @description com.person
 * @date 2017-8-17
 */
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
@ImportResource(locations = {"classpath:spring-trans.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
