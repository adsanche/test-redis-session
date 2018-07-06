package com.adsanche.testredissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestRedisSessionApplication {

    public static void main(String[] args) {

        final SpringApplication app = new SpringApplication(TestRedisSessionApplication.class);

        app.setWebApplicationType(WebApplicationType.REACTIVE);

        app.run(args);
    }
}
