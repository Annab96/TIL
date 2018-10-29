package ex10;

import java.util.Arrays;

public class Example11 {

	static void printSum(int... a) {
		int sum = 0;
		System.out.print("배열:[");
		for(int i : a) {
			if(i!=a[0])
				System.out.print(",");
			sum+=i;
			System.out.printf("%d", i);
		}
		System.out.printf("] 합계:%d \n", sum);
	}

	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 };

		printSum( 11, 13, 17, 20 );
		printSum( a );

	}
}
