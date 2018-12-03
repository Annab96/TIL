package jp15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Example1 {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>(); //다양성 구현하라 할때 자료형을 부모로

		for (int i = 0; i < 10; ++i)
			c.add(i);
		
		for (Integer i : c)
			System.out.print(i + " ");
		System.out.println();
		
		Iterator<Integer> iterator = c.iterator(); //탐색용 (for문에서 삭제를 못함, 그 에러를 잡기 위해)
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.print(i + " ");
		}
	}
}