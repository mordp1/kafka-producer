package com.redhat.springbootdmnkafkasample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringbootDmnKafkaSampleProducer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDmnKafkaSampleProducer.class, args);
	}

}
