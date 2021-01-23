package collections;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] marks = { 83, 56, 98, 86,94,85,93,85,98 };
		int sum = 0;
		
		int[] marksEx = { 83, 56, 98, 86,94,85,93,85,98 };

		/*
		 * for (int totalMarks : marks) { sum += totalMarks; } System.out.println(sum);
		 * System.out.println(marks.length);
		 * 
		 * 
		 * Object[] obj = { "krishna", 45, "e73henrj" };
		 * 
		 * System.out.println(Arrays.toString(obj));
		 */
		/*
		 * for (Object object : obj) { System.out.println(object); }
		 */
		for (int object : marks) {
			System.out.println(object);
		}
	
	}

}
