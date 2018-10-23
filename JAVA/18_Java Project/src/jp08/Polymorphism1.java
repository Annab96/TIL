package jp08;

class Parent1 {
	public void method1() {
		System.out.println("Parent method1()");
	}
}

class ChildOne1 extends Parent1 {
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
}

class ChildTwo1 extends Parent1 {
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
}

class ChildThree1 extends Parent1 {
}

public class Polymorphism1 {
	
	public static void main(String[] args) {
		Parent1 parent;
		ChildOne1 obj1 = new ChildOne1();
		ChildTwo1 obj2 = new ChildTwo1();
		ChildThree1 obj3 = new ChildThree1();
	
		obj1.method1(); // 다형성 호출이 아님
	
		parent = obj1;
		parent.method1(); // 다형성 호출
	
		parent = obj2;
		parent.method1(); // 다형성 호출
		
		parent = obj3;
		parent.method1(); // 다형성 호출
	}
}
