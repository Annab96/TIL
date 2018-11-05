package e2018.exam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Exam11 {
	
	static class Data {
		String value;

		public Data(String value) {
			 value = value.toUpperCase(); 
		}
		
	}

	public static void main(String[] args) {
		Collection<Data> a = new ArrayList<Data>();
		a.add(new Data("a"));
		a.add(new Data("b"));
		a.add(new Data("c"));
		a.remove(new Data("B"));
		System.out.println(a.toString());
	}
}
