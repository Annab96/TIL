package jp02;

public class Person01 {
	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 18);
		Person p2 = new Person("ȫ�浿", 18);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}
}