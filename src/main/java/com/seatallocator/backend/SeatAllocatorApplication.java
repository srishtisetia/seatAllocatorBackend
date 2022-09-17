package com.seatallocator.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SeatAllocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeatAllocatorApplication.class, args);
	}
}
