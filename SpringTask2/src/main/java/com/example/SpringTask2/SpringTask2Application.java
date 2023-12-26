package com.example.SpringTask2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringTask2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTask2Application.class, args);
	}

}
