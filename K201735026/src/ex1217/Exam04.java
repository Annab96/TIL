package ex1217;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam04 {
	public static String[] solution(String s) {
// 구현하라.
		String regex = "[0-9]{2,4}";
		String[] ss = new String[5];
		int i = 0;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while(matcher.find()) {
			ss[i] = matcher.group(0);
			i++;
		}
		return ss;
	}

	public static void main(String[] args) {
		String s = "a1223 (235) 157, 7814; asd_32as";
		String[] a = solution(s);
		System.out.println(Arrays.toString(a));
	}
}