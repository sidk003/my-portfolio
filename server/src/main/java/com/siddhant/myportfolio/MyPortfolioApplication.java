package com.siddhant.myportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableMongoRepositories
public class MyPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPortfolioApplication.class, args);
    }
}
