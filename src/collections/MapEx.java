package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("a", "apple");
		hashMap.put("b", "krishna");
		hashMap.put("z", "ravi");
		hashMap.put("" ,"");
		hashMap.put("c", "kanth");
		hashMap.put("p", "jdhei");
		hashMap.put("" ,"");
		hashMap.put("d", "gopi");
		hashMap.put("b", "krishna");
		hashMap.put("z", "ravi");
		System.out.println(hashMap);
		Map<String, String> map= new LinkedHashMap<String, String>();
		map.put("a", "apple");
		map.put("b", "krishna");
		map.put("z", "ravi");
		map.put("" ," ");
		map.put("d", "apple");
		map.put("k", "krishna");
		map.put("s", "ravi");
		map.put("" ," ");
		System.out.println(map);
		
	}

}
