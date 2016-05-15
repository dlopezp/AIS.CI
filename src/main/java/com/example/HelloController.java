package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello/{name}")
	public ResponseEntity<Message> hello(
		@PathVariable("name") String name
	) {
		return new ResponseEntity<>(new Message("Hola " + name + "!!"), HttpStatus.OK);
	}
	
}
