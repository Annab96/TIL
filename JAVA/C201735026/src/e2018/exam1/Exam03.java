package e2018.exam1; 

public class Exam03 {   
	
	public static void main(String[] args) {        
		// ������ �κ�       
		Object [] a = new Object[2];
		Object [] b;
		
		Person [] p = new Person[2];
		
		a = p;
		b = a;
		
		p[0] = new Person("ȫ�浿", "201132050", 2, 4.1);
		p[1] = p[0];
		
		System.out.println(a == b);        
		System.out.println(a[0] == b[1]);        
		System.out.println(a[0].equals(b[1]));    
	
	}
}
