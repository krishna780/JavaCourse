package interfaceEx;

interface Flyable {
	void fly();
}

class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Birds flying");
	}

}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("aeroplane");
	}

}

public class FlyableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] flyable = { new Bird(), new Aeroplane() };
		for (Flyable flyable2 : flyable) {
			flyable2.fly();
		}

	}

}
