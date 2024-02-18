package cab.booking.system.controller;

import org.springframework.stereotype.Component;

import cab.booking.system.model.UserOnboarding;
import cab.booking.system.service.UserService;


public class UserOnboardingController {

	
	
	
	private UserService userservice=new UserService();
	
	

	public void user_details(UserOnboarding userOnboarding) {
		try {
			userservice.user_details(userOnboarding);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}
	public void message() {
		try {
			userservice.message();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}
	
	
	
}
