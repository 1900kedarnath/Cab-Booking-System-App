package cab.booking.system.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cab.booking.system.dao.*;
import cab.booking.system.model.DriverOnboarding;

public class DriverInfo {

	
static public List<DriverOnboarding> driverdetails=new ArrayList<>();
static public Map<String, Boolean> available=new HashMap<>();



public void driver_details(DriverOnboarding driveronboarding) {
	
	try {
	driverdetails.add(driveronboarding);
	available.put(driveronboarding.getName(),true);
	}
	catch(Exception e) {
		System.out.println(e) ;
	}
}

public void message() {
	try {
		System.out.println(driverdetails) ;
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	
}




}
