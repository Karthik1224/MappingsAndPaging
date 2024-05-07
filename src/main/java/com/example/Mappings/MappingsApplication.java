package com.example.Mappings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.Mappings.onetoone.service.EmailService;

@SpringBootApplication
@EnableTransactionManagement
public class MappingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
		
		
	}

}
