package jp08;

class Parent2 {
	public void method1() {
		System.out.println("Parent method1()");
	}
}

class ChildOne2 extends Parent2 {
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
}

class ChildTwo2 extends Parent2 {
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
}

class ChildThree2 extends Parent2 {
}

public class Polymorphism2 {
	static void doSomething(Parent2 parent) {
		parent.method1(); // 다형성 호출
}

	public static void main(String[] args) {
		ChildOne2 obj1 = new ChildOne2();
		ChildTwo2 obj2 = new ChildTwo2();
		ChildThree2 obj3 = new ChildThree2();

		obj1.method1(); // 다형성 호출이 아님
	
		doSomething(obj1);
		doSomething(obj2);
		doSomething(obj3);
	}
}
