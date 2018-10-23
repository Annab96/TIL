package jp08;

interface Parent11 {
	double PI = 3.141592;
	
	void method1();
	void method2();
}

class ChildOne11 implements Parent11 {
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
	@Override
	public void method2() {
		System.out.println("ChildOne method2()");
	}
}

class ChildTwo11 implements Parent11 {
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
	@Override
	public void method2() {
		System.out.println("ChildTwo method2()");
	}
}

public class Interface1 {
	static void doSomething(Parent11 parent) {
		parent.method1();
		parent.method2();
	}
	public static void main(String[] args) {
		ChildOne11 obj1 = new ChildOne11();
		ChildTwo11 obj2 = new ChildTwo11();
		doSomething(obj1);
		doSomething(obj2);
	}
}
