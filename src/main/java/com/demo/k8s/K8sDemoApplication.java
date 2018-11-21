package com.demo.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Optional;

@SpringBootApplication
@RestController
public class K8sDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sDemoApplication.class, args);
	}

	@GetMapping("/{name}")
	public String hello(@PathVariable("name") String name) {
		return String.format("Hello %s", name);
	}
}
