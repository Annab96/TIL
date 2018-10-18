package jp04;

public class Person_e {
	String name;
	int age;
	BloodType_e bloodType_e;

	public Person_e(String name, int age, BloodType_e bloodType_e) {
		this.name = name;
		this.age = age;
		this.bloodType_e = bloodType_e;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public BloodType_e getBloodType_e() {
		return bloodType_e;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Person_e) == false) return false;
		Person_e p = (Person_e)obj;
		return (this.name == null ? p.name == null : this.name.equals(p.name)) &&
				this.bloodType_e == p.bloodType_e &&
				this.age == p.age;
	}

	@Override
	public String toString() {
		return String.format("Person{name=\"%s\", age=%d, bloodType=%s}", name, age, bloodType_e);
	}

}
