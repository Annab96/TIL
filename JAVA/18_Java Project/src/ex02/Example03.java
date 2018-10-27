package ex02;

public class Example03 {

	static String getFileName1(String path) {
		int index = path.lastIndexOf('/');
		return path.substring(index+1, path.length());
	}

	static String getFileName2(String path) {
		String [] ss = path.split("/");
		return ss[ss.length-1];
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx",
				"c:/www/mainpage.html",
		"c:/program files/java/javac.exe" };

		for (String s : a) {
			String fileName1 = getFileName1(s);
			String fileName2 = getFileName2(s);
			System.out.printf("%s, %s\n", fileName1, fileName2);

		}
	
	}
}
