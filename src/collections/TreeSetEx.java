package collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(100);
		numbers.add(50);
		numbers.add(600);
		numbers.add(900);
		numbers.add(400);

		System.out.println(numbers);
		System.out.println(numbers.floor(58));
		System.out.println(numbers.first());
		System.out.println(numbers.pollLast());
		numbers.subSet(15, 96);

	}

}
