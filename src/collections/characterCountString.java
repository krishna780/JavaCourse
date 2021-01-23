package collections;

import java.util.HashMap;
import java.util.Map;

public class characterCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an awesome occasion";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] characters = str.toCharArray();
		for (char character : characters) {
			Integer integer = map.get(character);
			if (integer == null) {
				map.put(character, 1);
			} else {
				map.put(character, integer + 1);
			}
		}
		System.out.println(map);

	}

}
