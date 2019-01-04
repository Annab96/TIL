package ex1217;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam02 {
	public static void solution(List<String> list) {
// 구현하라.
		String[] a = list.toArray(new String[list.size()]);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("d", "a", "b", "a", "c", "d", "e", "f", "e"));
		solution(list);
		System.out.println(list);
	}
}