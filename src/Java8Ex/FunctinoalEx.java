package Java8Ex;

import java.util.function.Function;

public class FunctinoalEx {

	public static void main(String[] args) {
		Function<String, Integer> func = l -> l.length();
		Function<Integer, Integer> func1=l->l*2;
		Integer integer = func.apply("krishna");
		
		Integer inte=func.andThen(func1).apply("krishna");
		System.out.println(inte);
		System.out.println(integer);

	}

}
