package ex1217;

import java.util.Arrays;

public class Exam09 {
	public static String[] insert(String[] a, int index, String s) {

	}

	public static void main(String[] args) {
		String[] a = { "a", "c", "d", "f", "g", "h" };
		a = insert(a, 1, "b");
		a = insert(a, 4, "e");
		System.out.println(Arrays.toString(a));
	}
}