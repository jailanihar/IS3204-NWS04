package week7;

public class LearningOneDimensionalArray {

	public static void main(String[] args) {
//		String name1 = "A";
//		String name2 = "B";
//		String name3 = "C";
//		String name4 = "D";
//		String name5 = "E";
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);
//		System.out.println(name4);
//		System.out.println(name5);
		
//		String[] names = new String[6];
//		names[0] = "A";
//		names[1] = "B";
//		names[2] = "C";
//		names[3] = "D";
//		names[4] = "E";
//		names[5] = "F";
		
		String[] names = {"A", "B", "C", "D", "E", "F"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		names[2] = "Z";
		// for-each loop is usually used to access all elements in array.
		for(String name : names) {
			System.out.println(name);
		}
	}
	
}






