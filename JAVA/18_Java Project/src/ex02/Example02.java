package ex02;

public class Example02 {

	static int getVowelCount(String s) {
		int m = 0;
		for(int i = 0 ; i<s.length(); i++) {
			if(s.charAt(i) == 'a'||s.charAt(i) == 'i'||s.charAt(i) == 'u'||s.charAt(i) == 'e'||s.charAt(i) == 'o'||
					s.charAt(i) == 'A'||s.charAt(i) == 'I'||s.charAt(i) == 'U'||s.charAt(i) == 'E'||s.charAt(i) == 'O')
				m++;
		}
		return m;
	}

	public static void main(String[] args) {
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
		for (String s : a) {
			int count = getVowelCount(s);
			System.out.printf("%s %d\n", s, count);
		}
	}
}
