package ex1217;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Exam13 {
	static class Data {
		private int i;
		private String s;

		public Data(int i, String s) {
			this.i = i;
			this.s = s;
		}
	}

	public static void solution(Data[] a) {
		Map<Integer, String> map = new HashMap<>();
		int count;
		for (int key : a) {
			Integer count = map.get(key);
			if (count == null)
				count = 0;
			++count;
			map.put(key, count);
		}
		for (int key : map.keySet())
			System.out.printf("Data(%d, %s) = %sȸ ", key, map.get(key), count);

	}

	public static void main(String[] args) {
		Data[] a = new Data[] { new Data(1, "a"), new Data(2, "b"), new Data(1, "a"), new Data(1, "a"),
				new Data(2, "b"), new Data(1, "c"), new Data(2, "b"), new Data(2, "a"), new Data(1, "c"),
				new Data(2, "a"), new Data(1, "a"), new Data(1, "b") };
		solution(a);
	}
}
