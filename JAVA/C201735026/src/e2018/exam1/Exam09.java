package e2018.exam1;

public class Exam09 {

	static String reverse(String path) {         
		// ������ �κ�    
		char[] c = path.toCharArray();
		for(int i=0; i<path.length(); i++){
			c[i] = path.charAt(path.length()-1-i);
			c[path.length()-1-i] = path.charAt(i);
		}  
		return String.valueOf(c);
	}
	
	public static void main(String[] args) {         
		String[] a = { "hello", "world", "hello world" };         
		for (String s : a)             
			System.out.println(reverse(s));     
	}
}
