package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:joke-config.xml") //xml config
public class Spring5Joke1AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5Joke1AppApplication.class, args);

	}
}
