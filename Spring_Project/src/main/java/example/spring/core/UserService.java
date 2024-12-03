package example.spring.core;

public class UserService implements GreetingService {

	private String userName;
	private int userAge;
	public UserService() {
		System.out.println("Inside an UserService");
	}
	public UserService(String userName, int userAge) {
		System.out.println("Inside UserService(String, int)");
		this.userName = userName;
		this.userAge = userAge;
	}

	public UserService(int userAge, String userName) {
		System.out.println("Inside UserService(int, String)");
		this.userName = userName;
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Set User Name");
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;

	}
	public void setUserAge(int userAge) {
		System.out.println("Set User Age");
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		String message = "👋 Hey " + userName + " Your age is " + userAge + " Years";
		return message;
	}
}
