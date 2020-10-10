package com.jullia.hibernatedemorelations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class HibernateDemoRelationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoRelationsApplication.class, args);
	}

}
