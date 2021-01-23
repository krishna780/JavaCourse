package mapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class CocurenctMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java world";
		Map<Character, Integer> occurences= new HashMap<Character, Integer>();
		char[] character=str.toCharArray();
		for (char c : character) {
			Integer integer=occurences.get(c);
			if (integer==null) {
				occurences.put(c, 1);
			}else {
				occurences.put(c, integer+1);
			}
			
		}
		System.out.println(occurences);
		
	   ConcurrentHashMap<Character, LongAdder> concurentmap=new ConcurrentHashMap<Character, LongAdder>();
	   String str1="welcome to java world";
	   
	}

}
