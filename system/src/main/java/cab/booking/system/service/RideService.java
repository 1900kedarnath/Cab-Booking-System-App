package cab.booking.system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cab.booking.system.dao.DriverInfo;
import cab.booking.system.dao.UserInfo;
import cab.booking.system.model.DriverOnboarding;
import cab.booking.system.model.UserOnboarding;

public class RideService {

	static List<DriverOnboarding> availableRide;
	Map<String ,Boolean> available=new DriverInfo().available;
	public List<DriverOnboarding> find_ride(String userName,int[]source,int []destination){
		
		
		 try {
			
			 UserInfo userinfo=new UserInfo();
			 DriverInfo driverInfo=new DriverInfo() ;
			 List<UserOnboarding> list=userinfo.userDetails;
			 boolean flag=false;
			 for(int i=0;i<list.size();i++) {
				 
				 
				 UserOnboarding userOnboarding=list.get(i);
				 String name=userOnboarding.getName();
				 if(name.equals(userName)) {
					flag=true;
				 }
				 
			 }
			 
			 if(!flag)
				 System.out.println("Invalid userName user does not exist");
			 
			 else {
				 
			List<DriverOnboarding>	driveronboarding= driverInfo.driverdetails ;
			availableRide=new ArrayList<>();
			
			for(int i=0;i<driveronboarding.size();i++)
			
			{
				DriverOnboarding driver=driveronboarding.get(i);
				int []location=driver.getCurrentLocation();
				String driverName=driver.getName();
				
				double value=Math.sqrt(Math.pow(Math.abs(location[0]-source[0]), 2)+Math.pow(Math.abs(location[1]-source[1]), 2));
				
				if(value<=5.0 && available.get(driverName)) {
					availableRide.add(driver);
					
				}
				
			}
				 
			 }
			 
			 
			 
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		
		return availableRide;
	}
	
	
	public String choose_ride(String userName,String driverName) {
		
		try {
			
			UserInfo userinfo=new UserInfo();
			 DriverInfo driverInfo=new DriverInfo() ;
			 List<UserOnboarding> list=userinfo.userDetails;
			 boolean flag=false;
			 for(int i=0;i<list.size();i++) {
				 
				 
				 UserOnboarding userOnboarding=list.get(i);
				 String name=userOnboarding.getName();
				 if(name.equals(userName)) {
					flag=true;
				 }
				 
			 }
			 
			 if(!flag)
				 System.out.println("Invalid userName user does not exist");
			 
			 else {
				 
			
			for(int i=0;i<availableRide.size();i++)
			
			{
				DriverOnboarding driver=availableRide.get(i);
				
				
				
				if(driver.getName().equals(driverName)) {
					return driverName;
					
				}
				
			}
				 
			 }
			 
			 
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		return "NO Driver found" ;
	}
	
	
}
