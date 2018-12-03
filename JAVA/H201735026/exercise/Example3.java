package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example3 {

	static void solution(int[] a) {
		// 배열 a에서 2의 배수와 3의 배수를 모두 제거하고
		// 제거된 항목의 뒷 항목들을 앞으로 당겨야 한다.
		// 제거된 항목 때문에 생간 배열 뒤의 공간에 -1을 채워라
		/* 내가 푼것
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0 || a[i] % 2 == 0) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				a[a.length - 1] = -1;
				i--;
			}
		}*/
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<a.length; ++i)
			if((a[i]%2 !=0) && (a[i]%3 !=0))
				list.add(a[i]);
		for(int i = 0; i<a.length; ++i)
			a[i] = (i<list.size()?list.get(i):-1);
	}

	
	static void solution2(int[] a) {
		for(int i = 0 ; i<a.length; ++i)
			if((a[i]%2 == 0) || (a[i]%3 == 0)) {
				removeAt(a,i);
				a[a.length-1] =-1;
		}
	}

	static void removeAt(int[] a, int index) {
		for(int i = index; i<a.length -1; ++i)
			a[i] = a[i+1];
	}
	
	static void insertAt(int[] a , int index, int value) {
		for(int i = a.length -1; i<index; --i)
			a[i] = a[i-1];
		a[index] = value;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] { 1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7 };
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
	}
}
