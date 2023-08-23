package com.shoptask2.o.shoptask2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shoptask2")
public class Shoptask2Application {

	public static void main(String[] args) {
		SpringApplication.run(Shoptask2Application.class, args);
	}

}
