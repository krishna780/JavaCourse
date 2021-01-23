package funcrionalEx;

import java.util.Arrays;
import java.util.List;

public class LambadaBehiend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays.asList(23, 4, 4, 55, 6, 7, 8, 56, 9).stream().filter(n -> n % 2 ==
		// 0).forEach(System.out::println);
		List<String> list = Arrays.asList("Ant", "Bat", "Cat", "Dog", "Elephant");
		//list.stream().map(m -> m.length()).forEach(System.out::println);
		list.stream().peek(System.out::println);

	}

}
