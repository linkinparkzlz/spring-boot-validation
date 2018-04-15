package com.example.springbootvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.example",exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SpringBootValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootValidationApplication.class, args);
	}
}
