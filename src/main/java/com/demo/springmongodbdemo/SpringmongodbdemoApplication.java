package com.demo.springmongodbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmongodbdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmongodbdemoApplication.class, args);
	}

	//	@Bean
//	public CommandLineRunner commandLineRunner(
//			ProductRepository productRepository
//	){
//		return args -> {
//			var product = Product.builder()
//					.name("IPhone")
//					.description("Smart phone")
//					.build();
//
//			productRepository.insert(product);
//			System.out.println(productRepository.findAll());
//		};
//	}

}
