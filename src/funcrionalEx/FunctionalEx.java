package funcrionalEx;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "cat", "dog", "rat");
		printWithFpFilter(list);

		List<Integer> inte = Arrays.asList(5, 6, 8, 9, 12, 8, 7);
		printingEvenOddNum(inte);
	}

	private static void printWithFp(List<String> list) {
		list.stream().forEach(System.out::println);

	}

	private static void printWithFpFilter(List<String> list) {
		list.stream().filter(f -> f.endsWith("at")).forEach(System.out::println);

	}

	private static void printingEvenOddNum(List<Integer> list) {
		// int li = list.stream().reduce(0, (num1, num2) -> num1 + num2);
	//	int in = list.stream().mapToInt(Integer::intValue).sum();
		Integer col=list.stream().collect(Collectors.summingInt(Integer::intValue));
	

		System.out.println(col);
		//list.stream().filter(a -> a % 2 == 0).forEach(System.out::println);

	}

}
