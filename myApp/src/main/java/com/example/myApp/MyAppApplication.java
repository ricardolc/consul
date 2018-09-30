package com.example.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}
}
