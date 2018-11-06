package jp13;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
	
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(101, new Person("È«±æµ¿", 18));
		map.put(102, new Person("ÀÓ²©Á¤", 19));
		
		System.out.printf("%s %s %s\n", map.get(101), map.get(102), map.get(103));
		
		map.remove(102);
		System.out.printf("%s %s %s\n", map.get(101), map.get(102), map.get(103));
	}
}
