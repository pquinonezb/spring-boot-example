package com.amx.springboot.demo.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {


	@GetMapping("/gretting")
	public String welcome(){
		return "Hola Spring Boot App";
	}

	@GetMapping("/gretting/{message}")
	public String gretting(@PathVariable String message){
		return "Mensaje desde OpenShift: " + message;
	}

	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
