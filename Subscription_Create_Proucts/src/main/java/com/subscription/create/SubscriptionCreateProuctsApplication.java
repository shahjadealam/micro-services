package com.subscription.create;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SubscriptionCreateProuctsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionCreateProuctsApplication.class, args);
	}

}
