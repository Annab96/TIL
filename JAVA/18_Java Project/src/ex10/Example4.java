package ex10;

public class Example4 {
	int a = 3, b = 4;
	
	class InnerClass{
		int tmp = 0;
		
		void swap() {
			tmp = a;
			a = b;
			b = tmp;
		}
	}
	void doSomething() {
		new InnerClass().swap();
		System.out.printf("%d %d\n", a, b);
	}
	
	public static void main(String[] args) {
		new Example4().doSomething();
	}
}
