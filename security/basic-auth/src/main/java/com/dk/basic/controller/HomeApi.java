package com.dk.basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {
	@GetMapping(value = "/")
	public ResponseEntity<String> getMessage(){
		
		return new ResponseEntity<String>("Logged in Successfully", HttpStatus.OK);
	}
}
