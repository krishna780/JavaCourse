package collections;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 85, 95, 90, 56, 86 };
		Student student = new Student("krishna", marks);
		int number = student.getNumberOfMarks();
		System.out.println(number);
		int totalNumber = student.getNumberOfMarks();
		System.out.println(totalNumber);
		int maximumMarks = student.getMaximumMarks();
		System.out.println(maximumMarks);
		int minimumMarks = student.getMinimumMarks();
		System.out.println(minimumMarks);
		BigDecimal average = student.getAverageMarks();
        System.out.println(average);
	}

}
