package collections;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {
		return marks.length;
		// TODO Auto-generated method stub

	}

	public int getTotalMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}

		return maximum;

	}

	public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;

	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		int sum=getTotalMarks();
		int length=getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(length),3,RoundingMode.UP);
	}

}
