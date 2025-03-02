package com.devgen.School;

import com.devgen.School.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);

		Product product = new Pro(1,"abc", "CS", 20000);
		System.out.println(pro);
	}



}
