package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/home")
	public ResponseEntity<String> getMessage(){
		logger.info("Hello Adi...!!!");
		
		logger.info("My second commit changes after some problem...!!!");
		logger.info("Add logger by aditya one more...!!!");
		logger.info("Add logger by harsh one more...!!!");
		logger.info("Hello samriddha ..!!!");
		
		return new ResponseEntity<String>("Hello Aditya...Good Morning....!!!", HttpStatus.OK);
	}
	
	
}
