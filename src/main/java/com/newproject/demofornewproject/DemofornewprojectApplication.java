package com.newproject.demofornewproject;

import com.newproject.demofornewproject.impl.EmailNotificationService;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemofornewprojectApplication  implements CommandLineRunner {

	//	@Autowired
	final NotificationService notificationServiceObj;

	public DemofornewprojectApplication(NotificationService notificationServiceObj) {
		this.notificationServiceObj = notificationServiceObj; //constructor DI preferred
	}

	public static void main(String[] args) {
		SpringApplication.run(DemofornewprojectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		notificationServiceObj.send("Hello");
	}


}
