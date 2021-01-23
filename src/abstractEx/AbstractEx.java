package abstractEx;

abstract class Animal {
	abstract public void bark();

	public void legs() {
		System.out.println("four legs");
	}

}

public class AbstractEx extends Animal {

	@Override
	public void bark() {
		System.out.println("barking dogs");
	}

	public static void main(String[] args) {
		AbstractEx abstractEx = new AbstractEx();
		abstractEx.legs();
	}

}
