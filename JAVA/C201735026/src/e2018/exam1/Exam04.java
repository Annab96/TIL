package e2018.exam1; 

public class Exam04 {    
	
	public static void doSomething(String s) {        
		// ������ �κ�    
		char[]c = s.toCharArray();
		for(int i =0; i<s.length();i++) {
			System.out.printf("(%c)", c[i]);
		}
		System.out.println("");
	}    
	
	public static void main(String[] args) {        
		String[] a = { "hello", "world", "hello world" };        
		for (String s : a)            
			doSomething(s);    
	}
}
