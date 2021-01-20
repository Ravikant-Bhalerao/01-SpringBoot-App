package com.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/welcome")
	public String Welcomemsg() {
		return "Welcome To RestApi";
	}

	@GetMapping("/greet")
	public String greetmsg() {
		return "Good Morning";
	}
	@GetMapping("/status")
	public ResponseEntity<String> setsource(){
		String msg="Data In body";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}
