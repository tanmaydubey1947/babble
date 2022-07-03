package com.main.babble.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Babble {
	
	@GetMapping("/babble")
	public String babble() {
		return "Hello I am Babble, currently I am under developmenet phase :)";
	}

}
