package cab.booking.system;
import cab.booking.system.service.DriverService;
import cab.booking.system.service.RideService;
import cab.booking.system.service.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cab.booking.system.dao.UserInfo;
import cab.booking.system.model.DriverOnboarding;
import cab.booking.system.model.UserOnboarding;

@SpringBootTest
class DriverTests {

	
	UserService userService=new UserService();
	DriverService driverService =new DriverService();
	RideService rideService=new RideService();
	
	@Test
	void user_details(){
		
		System.out.println("enter user details e.g.");
		System.out.println("Abhishek M 22");
		for(int i=0;i<3;i++) {
		Scanner sc=new Scanner(System.in);
		String user1=sc.nextLine();
		//String user1="Abhishek M 23" ;
		String []userdata=user1.split(" ");
		UserOnboarding userOnboarding=new UserOnboarding();
		
		userOnboarding.setName(userdata[0]);
		userOnboarding.setGender(userdata[1]);
		userOnboarding.setAge(Integer.valueOf(userdata[2]));
		
		assertEquals("User added successfully", userService.user_details(userOnboarding));
		}
//		String user2="Rahul M 29" ;
//		userdata=user2.split(" ");
//		
//		userOnboarding.setName(userdata[0]);
//		userOnboarding.setGender(userdata[1]);
//		userOnboarding.setAge(Integer.valueOf(userdata[2]));
//		
//		assertEquals("User added successfully", userService.user_details(userOnboarding));
//	
//		String user3="Nandini F 22" ;
//		userdata=user3.split(" ");
//		
//		userOnboarding.setName(userdata[0]);
//		userOnboarding.setGender(userdata[1]);
//		userOnboarding.setAge(Integer.valueOf(userdata[2]));
//		
//		assertEquals("User added successfully", userService.user_details(userOnboarding));
	
		
	}
	
	@Test 
	void driver_details() {
		
		System.out.println("enter driver details e.g.");
		System.out.println("Driver1 M 22\n"
				+ "swift\n"
				+ "10 1\n"
				+ "Driver2 M 29\n"
				+ "swift\n"
				+ "11 10\n"
				+ "Driver3 M 24\n"
				+ "swift\n"
				+ "5 3");
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
			String driver=sc.nextLine();
		//String driver="Driver1 M 22" ;
			
			String car=sc.nextLine();	
		//String car="Swift KA-01-12345";
			
			String []userdata=sc.nextLine().split(" ");
		int []location= new int[2];
		location[0]=Integer.valueOf(userdata[0]);
		location[1]=Integer.valueOf(userdata[1]);
		
		userdata=driver.split(" ");
		DriverOnboarding driverOnboarding=new DriverOnboarding();
		
		driverOnboarding.setName(userdata[0]);
		driverOnboarding.setGender(userdata[1]);
		driverOnboarding.setAge(Integer.valueOf(userdata[2]));
		driverOnboarding.setCurrentLocation(location);
		driverOnboarding.setVehicleDetails(car);
		
		
		
		assertEquals("Driver added successfully", driverService.driver_details(driverOnboarding));	
		}
		
//		 driver="Driver2 M 29" ;
//		car="Swift KA-01-12345";
//		int []location2= {11,10};	
//		userdata=driver.split(" ");
//		
//		driverOnboarding.setName(userdata[0]);
//		driverOnboarding.setGender(userdata[1]);
//		driverOnboarding.setAge(Integer.valueOf(userdata[2]));
//		driverOnboarding.setCurrentLocation(location2);
//		driverOnboarding.setVehicleDetails(car);
//		assertEquals("Driver added successfully", driverService.driver_details(driverOnboarding));	
//
//		 driver="Driver3 M 24" ;
//			car="Swift KA-01-12345";
//			int []location3= {5,3};	
//			userdata=driver.split(" ");
//			
//			driverOnboarding.setName(userdata[0]);
//			driverOnboarding.setGender(userdata[1]);
//			driverOnboarding.setAge(Integer.valueOf(userdata[2]));
//			driverOnboarding.setCurrentLocation(location3);
//			driverOnboarding.setVehicleDetails(car);
//			assertEquals("Driver added successfully", driverService.driver_details(driverOnboarding));	

	}
	
	
	
	
	
	@Test
    void find_ride() {
		System.out.println("enter user name e.g. Abhishek");
		System.out.println("source 10 0");
		System.out.println("destination 10 0");

		//System.out.println("")
		for(int i=0;i<3;i++) {
		Scanner sc=new Scanner(System.in);
		String userName=sc.nextLine();
		//String userName="Abhishek";
		
		String []location=sc.nextLine().split(" ");
	
		int []source= new int[2];
		source[0]=Integer.valueOf(location[0]);
		source[1]=Integer.valueOf(location[1]);
		
		location=sc.nextLine().split(" ");
		int []destination= new int[2];
		destination[0]=Integer.valueOf(location[0]);
		destination[1]=Integer.valueOf(location[1]);
		
		
		
		List<DriverOnboarding> result	=rideService.find_ride(userName, source, destination);
		String val="";
		if(result!=null && result.size()==0) {
			val="No ride found" ;
			
		assertEquals("No ride found", val);	
		}
		else
		{
			System.out.println(result);
		}
		}
//		String userName1="Rahul";
//		int []source1= {10,0};
//		int []destination1= {15,3};
//		List<DriverOnboarding> result1	=rideService.find_ride(userName1, source1, destination1);
//		
//		if(result1==null || result1.size()==0 )
//			assertEquals("No ride found","No ride found");
//		else
//		assertEquals("Driver1",result1.get(0).getName());
//		
//		
//		String userName2="Nandini";
//		int []source2= {15,6};
//		int []destination2= {20,4};
//		List<DriverOnboarding> result2	=rideService.find_ride(userName2, source2, destination2);
//		 
//		String val1="";
//			
//		if(result==null || result2.size()==0) {
//			val1="No ride found" ;
//			
//		assertEquals("No ride found", val1);	
//		}
//		else
//		{
//			System.out.println(result2);
//		}
//		
//		
		
		
		
    }

//	@Test
//	void choose_ride()
//	{
//		String userName="Abhishek"	;
//		String driverName="";
//	assertEquals(driverName, rideService.choose_ride(userName, driverName)	);	
//		
//	}


}
