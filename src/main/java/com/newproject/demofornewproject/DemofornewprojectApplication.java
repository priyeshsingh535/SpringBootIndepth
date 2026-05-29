package com.newproject.demofornewproject;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemofornewprojectApplication  implements CommandLineRunner {

	@Autowired
	PaymentService paymentServiceobj1;

	@Autowired
	PaymentService paymentServiceobj2;

	public static void main(String[] args) {
		SpringApplication.run(DemofornewprojectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(paymentServiceobj1.hashCode());
		System.out.println(paymentServiceobj2.hashCode());
		paymentServiceobj1.pay();
	}


}
