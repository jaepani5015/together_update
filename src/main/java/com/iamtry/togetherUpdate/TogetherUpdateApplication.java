package com.iamtry.togetherUpdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TogetherUpdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TogetherUpdateApplication.class, args);
	}

}
