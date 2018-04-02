package com.fullstack.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		
		ApplicationContext application = SpringApplication.run(SpringbootApplication.class, args);
		BinarySearch binary = application.getBean(BinarySearch.class);
		
		int[] numbers = { 1, 2, 3, 4, 5 };
		binary.binarySearch(numbers, 5);
		
	}
}
