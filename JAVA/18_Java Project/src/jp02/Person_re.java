package jp02;

import java.util.Objects;

public class Person_re {
	String name;
	int age;

	public Person_re(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person_re == false) return false;
		Person_re p = (Person_re)obj;
		return Objects.equals(this.name, p.name) && this.age == p.age;
	}

	@Override
	public String toString() {
		return String.format("Person{name=\"%s\", age=%d}", name, age);
	}
}