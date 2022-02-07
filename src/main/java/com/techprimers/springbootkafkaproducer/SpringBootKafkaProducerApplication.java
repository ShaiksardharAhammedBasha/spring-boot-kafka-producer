package com.techprimers.springbootkafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaProducerApplication {

	public static void main(String[] args) {
		System.out.println("Master Branch  Kafka Producer Application");
		SpringApplication.run(SpringBootKafkaProducerApplication.class, args);
	}

}
