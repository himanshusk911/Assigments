package com.autenticate.userAuth;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/auth.html")
	public String userAuth(@ModelAttribute("User") User User) {
	
	
	boolean isvalid=check(User.getName(),User.getPassword());
	if(isvalid) {
		return "valid user";
	}
	return "Invalid user";
	}
	


public boolean check(String name, String password) {
	if(name.contentEquals("Rishabh") && password.equals("123")) {
		return true;
	}
	return false;
}
}
