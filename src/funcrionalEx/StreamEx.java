package funcrionalEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Integer> num = Arrays.asList(6, 9, 35, 6, 7, 8, 83, 9, 18);
		//num.stream().mapToInt(v -> v).max().orElseThrow(Exception::new);
		num.stream().map(e -> e * 2).collect(Collectors.toList()).forEach(System.out::println);

		// num.stream().sorted().distinct().forEach(System.out::println);

		// num.stream().sorted().distinct().map(e -> e *
		// e).forEach(System.out::println);
		IntStream.range(0, 10).filter(e -> e % 2 == 0).forEach(System.out::println);

		Optional<Integer> sum = num.stream().max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(sum);
	}

}
