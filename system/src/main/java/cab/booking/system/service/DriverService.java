package cab.booking.system.service;

import cab.booking.system.dao.DriverInfo;
import cab.booking.system.model.DriverOnboarding;

public class DriverService {

	
	private DriverInfo driverinfo=new DriverInfo();
	
	
	public String driver_details(DriverOnboarding driveronboarding) {
		
		try {
			driverinfo.driver_details(driveronboarding);
		}
		catch(Exception e) {
			System.out.println(e) ;
		}
		return "Driver added successfully";
	}

	public void message() {
		try {
			driverinfo.message();
			}
			catch(Exception e) {
				
				System.out.println(e) ;
			}	
	}
	
	
}
