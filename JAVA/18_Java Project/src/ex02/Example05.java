package ex02;

public class Example05 {

	static String[] split1(String s) {
		String[] ss = s.replace(" ","").split(",");
		return ss;
	}

	static String[] split2(String s) {
		String [] ss = s.split(",");
		for(int i = 0; i < ss.length-1;i++) {
			ss[i] = ss[i].trim();
		}
		return ss;
	}

	public static void main(String[] args) {
		String s = "One, Two ,Three , Four,Five";
		
		String[] a1 = split1(s);
		for (String t : a1)
			System.out.printf("[%s]\n", t);

		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t);
	}
}
