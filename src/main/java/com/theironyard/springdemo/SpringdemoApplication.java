package com.theironyard.springdemo;

import org.springframework.context.annotation.ComponentScan;
import us.dreisbach.greetings.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("us.dreisbach.greetings")
@ComponentScan("com.theironyard.springdemo")
public class SpringdemoApplication {
	private GreetingService greetingService;

	@Autowired
	public SpringdemoApplication(GreetingService service) {
		System.out.println("GreetingService injected:");
		System.out.println(service);
		System.out.println(service.getGreeting());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
}
