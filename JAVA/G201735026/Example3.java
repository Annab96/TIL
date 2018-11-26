import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
		// 구현1
		List<String> list = new ArrayList<>();
		for (String s : a)
			if (list.contains(s) == false)
				list.add(s);
		System.out.println(list.toString());

		// 구현2
		Set<String> set = new HashSet<>();
		for (String s : a)
			set.add(s);
		System.out.println(set.toString());
	}
}