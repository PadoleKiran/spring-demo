package com.devgen.School;

import com.devgen.School.model.Product;
import com.devgen.School.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SchoolApplication.class, args);

		ProductService productService = context.getBean(ProductService.class);

		productService.getAll().forEach(System.out::println);
//		Product product = new Pro(1,"abc", "CS", 20000);
//		System.out.println(pro);
	}



}
