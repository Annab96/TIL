package ex1217;

import java.util.Arrays;

public class Exam14 {
	public static String[] solution(String[] a1, String[] a2) {
		String[] s = new String[a1.length + a2.length];
		for (int i = 0; i < a1.length; i++)
			s[i] = a1[i];

		for (int i = a1.length; i < s.length; i++)
			s[i] = a2[i - a1.length];
		return s;
	}

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "c" };
		String[] a2 = { "B", "D", "C", "A" };
		String[] a3 = solution(a1, a2);
		System.out.println(Arrays.toString(a3));
	}
}