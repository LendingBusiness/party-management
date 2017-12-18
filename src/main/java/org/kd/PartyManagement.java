package org.kd;

import org.kd.service.PartyDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PartyManagement {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PartyManagement.class, args);
		context.getBean(PartyDemoService.class).printFirstParty();
		context.getBean(PartyDemoService.class).printAllParties();
	}
}
