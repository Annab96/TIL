package jp13;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(new Person("È«±æµ¿", 18), 101);
		map.put(new Person("ÀÓ²©Á¤", 19), 102);
	
		System.out.println(map.get(new Person("È«±æµ¿", 18)));
		System.out.println(map.get(new Person("ÀÓ²©Á¤", 19)));
	}
}
