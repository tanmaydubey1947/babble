package com.main.babble.initalPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * This class is responsible for handling the requests which are present on the starting page. It is basically the main page from where the flow will start.
 * 
 */
@RestController
public class InitialPage {
	
	@GetMapping("/homePage")
	public String babble() {
		
		String homePageMessage = "Hello Welcome To Babble";
		return homePageMessage;
	}
	
}
