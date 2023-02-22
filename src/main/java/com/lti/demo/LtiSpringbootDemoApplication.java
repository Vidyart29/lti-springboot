package com.lti.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LtiSpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtiSpringbootDemoApplication.class, args);
		System.out.println("controller working..now goto localhost:8080/hello");
	}

}
