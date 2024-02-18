package cab.booking.system.service;

import cab.booking.system.dao.UserInfo;
import cab.booking.system.model.UserOnboarding;

public class UserService {


	
	private UserInfo userinfo=new UserInfo();
	
	public String user_details(UserOnboarding useronboarding) {
		
		try {
		userinfo.user_details(useronboarding);
		}
		catch(Exception e) {
			
			System.out.println(e) ;
		}
		return "User added successfully";
	}

	public void message() {
		try {
			userinfo.message();
			}
			catch(Exception e) {
				
				System.out.println(e) ;
			}
		
	}
	
	
	
	
}
