package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("carrot");
		set.add("krishna");
		set.add("apple");
		set.add("banana");
		set.add("carrot");
		set.add("gopi");
		System.out.println(set);
		
		Set<String> hashSet = new  HashSet<>();
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("carrot");
		hashSet.add("krishna");
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("carrot");
		hashSet.add("gopi");
		System.out.println(hashSet);
	}

}
