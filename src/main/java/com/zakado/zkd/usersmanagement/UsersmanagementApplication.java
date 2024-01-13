package com.zakado.zkd.usersmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UsersmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersmanagementApplication.class, args);
	}

}
