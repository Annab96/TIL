package jp06;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
	Person[] a = new Person[] {
			new Person("ȫ�浿", 18),
			new Person("�Ӳ���", 22),
			new Person("����ġ", 23)
	};
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	}
}
