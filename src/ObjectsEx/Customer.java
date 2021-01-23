package ObjectsEx;

public class Customer {

	private String name;
	private Address homeAddress;
	private Address workAddress;

	Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}

}
