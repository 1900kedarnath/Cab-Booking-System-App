package cab.booking.system.controller;

import cab.booking.system.model.DriverOnboarding;
import cab.booking.system.service.DriverService;

public class DriverOnboardingController {

	
	
	DriverService driverService=new DriverService() ;
	
 public void driver_details(DriverOnboarding driveronboarding) {
		
		try {
			driverService.driver_details(driveronboarding);
		}
		catch(Exception e) {
			System.out.println(e) ;
		}
	}
		
		
 public void message() {
		try {
			driverService.message();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}
	
}
