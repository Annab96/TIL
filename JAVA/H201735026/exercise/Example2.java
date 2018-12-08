package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	static void solution(List<Integer> a) {
		// 목록 a에서 2의 배수와 3의 배수를 모두 제거하라
		int index = 0;
		while (index < a.size()) {
			int value = a.get(index);
			if ((value % 2) == 0 || (value % 3) == 0)
				a.remove(index);
			else
				++index;
		}
	}

	static void solution2(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int value = it.next();
			if ((value % 2) == 0 || (value % 3) == 0)
				it.remove(); // ok
		}
	}

	static void solution3(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int value = it.next();
			if ((value % 2) == 0 || (value % 3) == 0)
				list.remove(value); // error
		}
	}

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.addAll(Arrays.asList(new Integer[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 }));
		System.out.println(a.toString());
		solution3(a);
		System.out.println(a.toString());
	}
}
