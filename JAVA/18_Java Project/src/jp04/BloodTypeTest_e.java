package jp04;

public class BloodTypeTest_e {

	public static void main(String[] args) {
		Person_e p1 = new Person_e("홍길동", 18, BloodType_e.AB);
		Person_e p2 = new Person_e("전우치", 24, BloodType_e.O);

		System.out.println(p1);
		System.out.println(p2);

		BloodType_e blood1 = BloodType_e.valueOf("AB");
		BloodType_e blood2 = BloodType_e.valueOf("A");
		System.out.println(blood1.canGiveTo(blood2));
		System.out.println(blood2.canGiveTo(blood1));

		for (BloodType_e blood : BloodType_e.values())
			System.out.println(blood);
		
		String s = "";
		switch (p1.getBloodType_e()) {
		case A: s = "A형"; break;
		case B: s = "B형"; break;
		case AB: s = "AB형"; break;
		case O: s = "O형"; break;
		}
		System.out.println(s);
	}

}
