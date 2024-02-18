package cab.booking.system.controller;

import java.util.List;

import cab.booking.system.model.DriverOnboarding;
import cab.booking.system.service.RideService;

public class RideController {

	
	
	
	RideService rideservice=new RideService();
	public List<DriverOnboarding> find_ride(String userName,int[]source,int []destination){
		
		
		return rideservice.find_ride(userName, source, destination);
		
	}
	
	
	public String choose_ride(String userName,String driverName) {
		
		return rideservice.choose_ride(userName, driverName);
		
	}
	
	
	
}
