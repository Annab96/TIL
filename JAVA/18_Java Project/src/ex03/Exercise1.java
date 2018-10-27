package ex03;

public class Exercise1 {

	private static Object [] arr;
	
	public 	static void main(String [] args) {
		addData(3);
		System.out.println(findIndex(1));
		System.out.println(findIndex("1"));
	}
	
	public static void addData(int count) {
		arr = new Object[2*count];
		for(int i =0 ; i < count ; i++) {
			arr[2*i] = new Integer(i);
			arr[2*i+1] = String.valueOf(i);
		}
		System.out.println(arr.length);
	}
	
	public static int findIndex(int value) {
		Integer a = new Integer(value);
		for(int i = 0; i<arr.length; i++) {
			if(a.equals(arr[i]))
				return i;
		}
		return -1;
	}
	public 	static int findIndex(String value) {
		String a = String.valueOf(value);
		for(int i =0; i<arr.length; i++) {
			if(a.equals(arr[i]))
				return i;
		}
		return -1;
	}
}
