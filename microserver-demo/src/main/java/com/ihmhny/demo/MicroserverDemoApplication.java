package com.ihmhny.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ihmhny.demo.dao")
public class MicroserverDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserverDemoApplication.class, args);
	}
}
