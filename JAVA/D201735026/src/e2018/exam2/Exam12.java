package e2018.exam2;

class World {
	String message;

	class Hello {
		World world;

		Hello(World world) {
			this.world = world;
		}

		void say() {
			System.out.println(world.message);
		}
	}

	public void doSomething() {
		Hello hello = new Hello(this);
		message = "æ»≥Á«œººø‰";
		hello.say();
	}

}

public class Exam12 {
	public static void main(String[] args) {
		World world = new World();
		world.doSomething();
	}
}
