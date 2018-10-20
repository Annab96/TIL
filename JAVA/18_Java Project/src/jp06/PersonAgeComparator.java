package jp06;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.age - p2.age;
		if(r!= 0) return r;
		return p1.name.compareTo(p2.name);
	}
}
