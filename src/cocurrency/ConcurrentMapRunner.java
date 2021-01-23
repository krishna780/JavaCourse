package cocurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, LongAdder> occurances = new Hashtable<Character, LongAdder>();

		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			LongAdder longAdder = occurances.get(character);
			if (longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurances.put(character, longAdder);
		}
		System.out.println(occurances);

		ConcurrentMap<Character, LongAdder> occurance = new ConcurrentHashMap<Character, LongAdder>();
		String str1 = "ABCD ABCD ABCD";
		for (char charact : str1.toCharArray()) {
			occurance.computeIfAbsent(charact, c -> new LongAdder()).increment();

		}

		System.out.println(occurance);

	}
}