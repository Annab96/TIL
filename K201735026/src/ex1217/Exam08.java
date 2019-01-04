package ex1217;

import java.util.Arrays;

public class Exam08 {
	public static void insert(String[] a, int index, String s) {
		String[] ss = new String[10];
		
		for (int i = 0; i <a.length; i++)
			ss[i] = a[i];
		
		for(int i = 0; i<ss.length; i++) {
			if(i == index) {
				for(int j = index ; i<10; j++) {
					ss[j] = ss[j-1];
				}
			}
			ss[index] = s;
		}
	}

	public static void main(String[] args) {
		String[] a = { "a", "c", "d", "f", "g", "h" };
		insert(a, 1, "b");
		insert(a, 4, "e");
		System.out.println(Arrays.toString(a));
	}
}