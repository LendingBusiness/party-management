package org.kd.party;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PartyManagement {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		context = SpringApplication.run(PartyManagement.class, args);
	}

	public static ConfigurableApplicationContext getContext() {
		return context;
	}
}
