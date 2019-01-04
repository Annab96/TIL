package ex1217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam06 {
	public static List<String> intersection(String[] a1, String[] a2) {
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		list.addAll(Arrays.asList(a1));
		list.retainAll(Arrays.asList(a2));
		for (int i = 0; i < list.size(); i++)
			if (!list1.contains(list.get(i))) {
				list1.add(list.get(i));
			}
		return list1;
	}

	public static void main(String[] args) {
		String[] a1 = { "a", "d", "a", "b", "b", "c" };
		String[] a2 = { "c", "a", "e", "f", "b", "g" };
		List<String> list = intersection(a1, a2);
		System.out.println(list.toString());
	}
}