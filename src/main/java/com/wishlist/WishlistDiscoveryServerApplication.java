package com.wishlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WishlistDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishlistDiscoveryServerApplication.class, args);
	}

}

