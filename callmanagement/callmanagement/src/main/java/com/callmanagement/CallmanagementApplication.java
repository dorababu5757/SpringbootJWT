package com.callmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		CallmanagementApplication.class,
		Jsr310JpaConverters.class
})
@EnableAutoConfiguration
public class CallmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallmanagementApplication.class, args);
	}

}
