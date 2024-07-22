package com.example.BookstoreBakersButBetter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BookstoreBakersButBetterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBakersButBetterApplication.class, args);
	}

}
