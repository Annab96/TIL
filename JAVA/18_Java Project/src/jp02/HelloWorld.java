package jp02;

public class HelloWorld {
	public static void main(String[] args) {
			GoodMorning g = new GoodMorning();
			System.out.println("hello world");
			System.out.println(g.hello());
	}
}

class GoodMorning {
	public String hello() {
		return "good morning";
	}
}