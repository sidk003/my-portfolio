package com.siddhant.myportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MyPortfolioApplication {

  public static void main(final String[] args) {
    SpringApplication.run(MyPortfolioApplication.class, args);
  }
}
