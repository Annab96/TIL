package e2018.exam1; 

import java.util.Objects; 

public class Person {     
	String name;     
	String no;     
	int year;     
	double grade;     
	
	public Person(String name, String no,int year, double grade) {         
		this.name = name;         
		this.no = no;         
		this.year = year;         
		this.grade = grade;     
	}     
	
	// ������ �κ� }
	@Override
	public boolean equals(Object obj) {
	if ((obj instanceof Person) == false) return false;
	Person p = (Person)obj;
	return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.year == p.year &&
			(this.no == null ? p.no == null : this.no.equals(p.no)) && this.grade == p.grade;
	}
}
