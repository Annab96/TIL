import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Example1 {
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\ehsdi\\Desktop\\Git\\TIL\\JAVA\\18_Java Project\\src\\jp02\\Person.java";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		while (scanner.hasNext("[a-zA-Z]+")) {
			String s = scanner.next();
			
			Integer count = map.get(s);
			if(count == null) count = 0;
			map.put(s,count+1);
		}
		
		for(String key : map.keySet())
			System.out.printf("%s %d\n",key, map.get(key));
		
		
		scanner.close();
	}
}
