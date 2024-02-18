package cab.booking.system;

import java.util.List;
import java.util.Scanner;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cab.booking.system.controller.DriverOnboardingController;
import cab.booking.system.controller.RideController;
import cab.booking.system.controller.UserOnboardingController;
import cab.booking.system.model.DriverOnboarding;
import cab.booking.system.model.UserOnboarding;

@SpringBootApplication
public class Driver {

	
	private	UserOnboardingController   userOnboardingController=new UserOnboardingController() ;
	private	DriverOnboardingController   driverOnboardingController=new DriverOnboardingController() ;
   private RideController rideController=new RideController();
	public static void main(String[] args) {
		
		SpringApplication.run(Driver.class, args);
	
	 int choice=0;
	 
	 System.out.println("press 1 for userOnboarding");
	 System.out.println("press 2 for driverOnboarding");
	 System.out.println("press 3 for finding Ride");
	 System.out.println("press 4 for Choosing ride");
	 System.out.println("press  5 for exit");
	 Driver driver=new Driver();
	 
		while(choice!=5) {
			
			System.out.println("please enter your choice") ;
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt() ;
			 	
		switch(choice) {
		
		case 1:
			System.out.println("Please enter user name gender and age e.g. Abhishek M 23");
			Driver cabBookingAppApplication1=new Driver();
			driver.user_Demo();
			driver.usermessage();
			break;
			
		case 2:
			
			driver.driver_Demo();
			driver.drivermessage();
			break;
		case 3:
			 driver.find_ride();
			break;
		case 4:
			driver.choose_ride();
			break;
			
		default :
		 System.out.println("Choice has not been selected");
				}
			
		}	

			
			
			
		
	
	}
	
	   private  void user_Demo() {
		
		Scanner sc=new Scanner(System.in);
		 String []input=sc.nextLine().split(" ") ;
		 UserOnboarding userOnboarding=new UserOnboarding();
		 userOnboarding.setName(input[0]);
		 userOnboarding.setGender(input[1]);
		 userOnboarding.setAge(Integer.valueOf(input[2]));
		 userOnboardingController.user_details(userOnboarding);;
	System.out.println("user added successfully");
	
		
	}
	   
	   private  void driver_Demo() {
			
		   System.out.println("Please enter Driver name gender and age e.g. Abhishek M 23");
			Scanner sc=new Scanner(System.in);
			 String []input=sc.nextLine().split(" ") ;
			 DriverOnboarding driverOnboarding=new DriverOnboarding();
			 driverOnboarding.setName(input[0]);
			 driverOnboarding.setGender(input[1]);
			 driverOnboarding.setAge(Integer.valueOf(input[2]));
			 System.out.println("Please enter car details e.g. Swift KA-01-12345"); 
			  sc=new Scanner(System.in);
			  driverOnboarding.setVehicleDetails(sc.nextLine()) ;
			  
			  System.out.println("Please enter yours details e.g. 10 0"); 
			  sc=new Scanner(System.in);
			  String []arr=sc.nextLine().split(" ");
			  int [] location=new int[2];
			  location[0]=Integer.valueOf(arr[0]);
			  location[1]=Integer.valueOf(arr[1]);
			  driverOnboarding.setCurrentLocation(location);
			 driverOnboardingController.driver_details(driverOnboarding);;
		System.out.println("user added successfully");
		
			
		} 
	   
	   
	   public void usermessage() {
		   
		   userOnboardingController.message();
		   
	   }
   public void drivermessage() {
		   
	   driverOnboardingController.message();
		   
	   }
	private void find_ride()	{
		 System.out.println("Please enter User name e.g. Abhishek");
			Scanner sc=new Scanner(System.in);
			String userName=sc.nextLine();
			System.out.println("Please enter yours current location e.g. 10 0"); 
			  sc=new Scanner(System.in);
			  String []arr=sc.nextLine().split(" ");
			  int [] source=new int[2];
			  source[0]=Integer.valueOf(arr[0]);
			  source[1]=Integer.valueOf(arr[1]);
			  System.out.println("Please enter yours destination location e.g. 10 0"); 
			  sc=new Scanner(System.in);
			  String []arr1=sc.nextLine().split(" ");
			  int [] destination=new int[2];
			  destination[0]=Integer.valueOf(arr[0]);
			  destination[1]=Integer.valueOf(arr[1]);
			  List<DriverOnboarding> result=  rideController.find_ride(userName, source, destination);
			  if(result.size()==0)
				  System.out.println("No ride found");
			  else
			System.out.println(  rideController.find_ride(userName, source, destination));	    
			  
		
	}
	
	private void choose_ride() {
		
		 System.out.println("Please enter User name e.g. Abhishek");
			Scanner sc=new Scanner(System.in);
			String userName=sc.nextLine();
			 System.out.println("Please enter driver  name e.g. Abhishek");
				 sc=new Scanner(System.in);
				String driverName=sc.nextLine();
				
			System.out.println( rideController.choose_ride(userName, driverName));
	}

}
