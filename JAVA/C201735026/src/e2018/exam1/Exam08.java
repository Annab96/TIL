package e2018.exam1;

public class Exam08 {
	
	static int sum(int[][] a) {         
		// 구현할 부분     
		int[]n = new int[9];
		int sum=0;
		
		for(int i =0; i< a.length; ++i)
			for(int j=0; j<a[i].length; ++j)
				n[3*i+j] = a[i][j];
		
		for(int i=0; i<9; i++)
			sum += n[i];

		return sum;
	}     
	
	public static void main(String[] args) {         
		int[][] a1 = { {1, 3, 6}, {2, 6, 3}, {6, 9, 10} };         
		int[][] a2 = { {5, 4, 1}, {10, 8, 3}, {7, 2, 6} };         
		System.out.println(sum(a1));         
		System.out.println(sum(a2));     
	}
		
}
