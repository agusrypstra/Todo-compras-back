package com.todoCompras.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.todoCompras.backend")
public class BackTodoComprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackTodoComprasApplication.class, args);
	}

}
