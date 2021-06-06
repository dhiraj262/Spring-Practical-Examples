package com.dk.basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {
	@GetMapping("/")
	public ResponseEntity<String> getMessage(){
		
		return new ResponseEntity<String>("Logged in Successfully", HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<String> user(){
		
		return new ResponseEntity<String>("User Logged in Successfully", HttpStatus.OK);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin(){
		
		return new ResponseEntity<String>("admin Logged in Successfully", HttpStatus.OK);
	}
}
