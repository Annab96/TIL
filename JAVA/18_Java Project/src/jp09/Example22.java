package jp09;

import java.util.Arrays;
import java.util.TreeSet;

class StringSet2 { TreeSet<String> list = new TreeSet<String>();
	public void add(String s) {
		list.add(s);
	}

	public void remove(String s) {
		list.remove(s);
	}

	public boolean contains(String s) {
		return list.contains(s);
	}

	public StringSet2 union(StringSet2 set) {
		StringSet2 newSet = new StringSet2();
		newSet.list.addAll(this.list);
		newSet.list.removeAll(set.list);
		newSet.list.addAll(set.list);
		return newSet;
	}

	public StringSet2 intersection(StringSet2 set) {
		StringSet2 newSet = new StringSet2();
		newSet.list.addAll(this.list);
		newSet.list.retainAll(set.list);
		return newSet;
	}

	public StringSet2 difference(StringSet2 set) {
	StringSet2 newSet = new StringSet2();
	newSet.list.addAll(this.list);
	newSet.list.removeAll(set.list);
	return newSet;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StringSet2 == false)
			return false;
		StringSet2 set = (StringSet2) obj;
		return this.list.equals(set.list);
	}

	public String[] toArray() {
		return list.toArray(new String[0]);
	}
}

public class Example22 {
	static void print(String msg, StringSet2 set) {
		String[] a = set.toArray();
		Arrays.sort(a);
		String temp = Arrays.toString(a);
		System.out.printf("%s: %s\n", msg, temp);
	}

	public static void main(String[] args) {
		StringSet2 A = new StringSet2();
		
		for (int i = 0; i < 20; ++i) {
			String s = String.format("%02d", i);
			A.add(s);
	}
		print("A", A);

		StringSet2 B = new StringSet2();
		for (int i = 0; i < 20; i += 2) {
			String s = String.format("%02d", i);
			B.add(s);
		}
		print("B", B);

		StringSet2 C = new StringSet2();
		for (int i = 0; i < 20; i += 3) {
			String s = String.format("%02d", i);
			C.add(s);
		}

		print("C", C);
		print("A 합집합 B", A.union(B));
		print("A 교집합 B", A.intersection(B));
		print("A 합집합 C", A.union(C));
		print("A 교집합 C", A.intersection(C));
		print("B 합집합 C", B.union(C));
		print("B 교집합 C", B.intersection(C));
		print("A 차집합 B", A.difference(B));
	}
}
