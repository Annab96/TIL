package e2018.exam1; 

public class Exam02 {    
	public static void main(String[] args) {        
		// ������ �κ�       
		
		Object[] a = new Object[2];
		Person[] p = new Person[2];
		
		
		p[0] = new Person("ȫ�浿", "201132050", 2, 4.1);
		p[1] = new Person("ȫ�浿", "201132050", 2, 4.1);
		
		a[0] = p[0];
		a[1] = p[1];
		System.out.println(a[0] == a[1]);        
		System.out.println(a[0].equals(a[1]));    
	
	}
}
