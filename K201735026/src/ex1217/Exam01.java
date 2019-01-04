package ex1217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam01 {
	public static List<String> solution(List<String> list) {
// 구현하라.
		
		String[] a = list.toArray(new String[list.size()]);
		List<String> ls = new ArrayList<>();
		for(String s : a)
			if(ls.contains(s) == false)
				ls.add(s);
		return ls;
			
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		List<String> list2 = solution(list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}