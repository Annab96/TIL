import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
	static void add(List<Integer> list, int count) {
		// list ��Ͽ� 0���� count ���� ������ �߰��Ѵ�.
		for (int i = 0; i < count; ++i)
			list.add(i);
	}

	static void removeEven(List<Integer> list) {
		// list ��Ͽ��� ������ ���� �����Ѵ�.
		Iterator<Integer> it = list.iterator(); // ���׸� ������ �ֱ� �� �ڹ� if((Integer)it.next() %2 == 0)
		while(it.hasNext()) {
			int n=it.next();
			if(n%2==0||n%3==0)
				it.remove();
		}
	}

	static void addEven(List<Integer> list) {
		// // list ����� Ȧ�� ���� ���̿� ¦�� ���� �����Ѵ�.

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		add(list, 10);
		System.out.println(list.toString());

		removeEven(list);
		System.out.println(list.toString());

		addEven(list);
		System.out.println(list.toString());

	}
}
