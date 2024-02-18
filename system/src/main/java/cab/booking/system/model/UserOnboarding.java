package cab.booking.system.model;

public class UserOnboarding {

	
	
	private String name;
	private String gender;
	private int age;
	
	
	
	
	public UserOnboarding() {
		super();
	}
	public UserOnboarding(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "UserOnboarding [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
