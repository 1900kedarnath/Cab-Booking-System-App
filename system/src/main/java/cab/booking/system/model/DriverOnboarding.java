package cab.booking.system.model;

import java.util.Arrays;

public class DriverOnboarding {

	
	private String name;
   private  String gender;
   private int age;
  private  String vehicleDetails;
  private  int[] currentLocation;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getVehicleDetails() {
	return vehicleDetails;
}
public void setVehicleDetails(String vehicleDetails) {
	this.vehicleDetails = vehicleDetails;
}
public int[] getCurrentLocation() {
	return currentLocation;
}
public void setCurrentLocation(int[] currentLocation) {
	this.currentLocation = currentLocation;
}

@Override
public String toString() {
	return "DriverOnboarding [name=" + name + ", gender=" + gender + ", age=" + age + ", vehicleDetails="
			+ vehicleDetails + ", currentLocation=" + Arrays.toString(currentLocation) + "]";
}
   
   
   
   
   
   














   

}
