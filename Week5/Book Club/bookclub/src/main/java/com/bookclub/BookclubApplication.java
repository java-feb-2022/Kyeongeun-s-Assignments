package com.bookclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.bookclub", "com.login"})
@EnableJpaRepositories({"com.login.repositories", "com.bookclub.repositories"})
@EntityScan({"com.login.models", "com.bookclub.models"})
public class BookclubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookclubApplication.class, args);
	}

}
