package com.portfoliowebsite.portfoliowebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioWebsiteApplication {

	public static void main(String[] args) {
		System.out.println("Starting Server");
		SpringApplication.run(PortfolioWebsiteApplication.class, args);
	}
}
