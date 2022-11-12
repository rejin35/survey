package com.servey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.servey.repository")
@EntityScan(basePackages = {"com.servey.model"})
@ComponentScan("com.*")
public class ServeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeyApplication.class, args);
	}

}
