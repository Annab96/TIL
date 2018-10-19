package jp05;

import jp04.BloodType;
import jp04.Person;

public class StringBuilder3 {

	public static void main(String[] args) {
		Person[] list = new Person[] {
				new Person("홍길동", 18, BloodType.AB),
				new Person("전우치", 24, BloodType.O),
				new Person("임꺽정", 22, BloodType.B)
		};

		StringBuilder builder = new StringBuilder();
		builder.append("<table>\n");
		builder.append(" <tr><td>이름</td></td><td>나이</td><td>혈액형</td></tr>\n");
		for (Person p : list) {
			builder.append(" <tr>");
			builder.append("<td>").append(p.getName()).append("</td>");
			builder.append("<td>").append(p.getAge()).append("</td>");
			builder.append("<td>").append(p.getBloodType()).append("</td>");
			builder.append("</tr>\n");
		}
		builder.append("</table>\n");
		System.out.println(builder.toString());
	}

}
