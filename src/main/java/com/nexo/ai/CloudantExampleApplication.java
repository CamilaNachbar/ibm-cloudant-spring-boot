package com.nexo.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CloudantExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudantExampleApplication.class, args);
	}
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CloudantExampleApplication.class);
	}
}
