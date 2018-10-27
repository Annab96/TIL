package ex05;

public class Example4 {

	static String reverse(String s) {
		char[] arr = s.toCharArray();
		
		for(int i = 0; i<s.length() ; i++) {
			arr[i] = s.charAt(s.length()-1-i);
			arr[s.length()-1-i] = s.charAt(i);
		}
		return String.valueOf(arr);
	}

	public static void main(String[] args) {
		String s = "hello world";
		s = reverse(s);
		System.out.println(s);
	}
}
