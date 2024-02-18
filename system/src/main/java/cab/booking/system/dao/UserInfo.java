package cab.booking.system.dao;

import java.util.ArrayList;
import java.util.List;

import cab.booking.system.model.UserOnboarding;

public class UserInfo {

	
	
	static public List<UserOnboarding> userDetails=new ArrayList<>();

	
	
	public void user_details(UserOnboarding useronboarding) {
		
		
		try {
		userDetails.add(useronboarding);
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
	}

	public void message() {
		try {
			System.out.println(userDetails) ;
			}
			catch(Exception e) {
				
				System.out.println(e);
			}
		
	}

	
	
	
	
	
}
