
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
	static List<String> solution(String[] a1, String[] a2, String[] a3) {
		List<String> list = new ArrayList<String>();
		
		for(int i = 0 ; i<a1.length;i++)
				list.add(a1[i]);
		
		for(int i = 0 ; i<a2.length; i++) {
			if(list.get(i) != a2[i])
				list.add(a2[i]);
		}

		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < list.size(); j++)
				if (a3[i] == list.get(j))
					list.remove(j);
		}

		return list;
	}

	public static void main(String[] args) {
		String[] a1 = { "A", "B", "D", "F", "G" };
		String[] a2 = { "B", "C", "F", "H", "I" };
		String[] a3 = { "B", "F", "G", "H", "I" };
		System.out.println(solution(a1, a2, a3));
	}
}