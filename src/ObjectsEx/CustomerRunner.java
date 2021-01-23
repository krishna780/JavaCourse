package ObjectsEx;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address homeAddress = new Address("7402 chadwell cir", "baltimore", 21244);
		Customer customer = new Customer("krishna", homeAddress);

		Address workAddress = new Address("29 linden st", "Hackensack", 07601);
		customer.setWorkAddress(workAddress);
		System.out.println(customer);

	}

}
