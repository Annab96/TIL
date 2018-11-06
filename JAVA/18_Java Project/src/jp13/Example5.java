package jp13;

import java.util.HashMap;
import java.util.Map;

public class Example5 {
	
	public static void main(String[] args) {
		Map<Person2, Integer> map = new HashMap<Person2, Integer>();
		map.put(new Person2("È«±æµ¿", 18), 101);
		map.put(new Person2("ÀÓ²©Á¤", 19), 102);
	
		System.out.println(map.get(new Person2("È«±æµ¿", 18)));
		System.out.println(map.get(new Person2("ÀÓ²©Á¤", 19)));
	}
}
