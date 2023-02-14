package com.metro.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication
@EnableJpaRepositories("com.metro.bus.repository")
@EnableTransactionManagement
public class MetroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetroServiceApplication.class, args);
	}

}
