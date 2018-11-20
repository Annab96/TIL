package jp14;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
	static String readTextFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\ehsdi\\Desktop\\Git\\TIL\\JAVA\\18_Java Project\\홈페이지_게시판.html";
		String s = readTextFile(path, Charset.forName("EUC-KR"));
	
		String regex = "<a href='boardread.aspx\\?idx=([0-9]+)[^>]+>([^<]+)</a>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find())
			System.out.printf("%s %s\n", matcher.group(1), matcher.group(2));
	}
}
