import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
	public static void main(String[] args) {
		String s = "<tr><td>È«±æµ¿</td><td>18</td></tr><tr><td>ÀÓ²©Á¤</td><td>19</td></tr>"
				+ "<span>false</span><div><span>true</span></div>";

		s = s.replaceAll("<tr>", "");
		s = s.replaceAll("</tr>", "");
		s = s.replaceAll("<td>", "TAG:td TEXT:");
		s = s.replaceAll("</td>", "\n");
		s = s.replaceAll("<div>", "");
		s = s.replaceAll("</div>", "");
		s = s.replaceAll("<span>", "TAG:span TEXT:");
		s = s.replaceAll("</span>", "\n");
		s = s.replaceAll("</?[a-zA-Z]+>", "\n");
		System.out.printf("%s", s);

	}
}
