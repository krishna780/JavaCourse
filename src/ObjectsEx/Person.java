package ObjectsEx;

public class Person {
	private String name;
	private String email;
	private String phoneNumber;
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String email, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

}
