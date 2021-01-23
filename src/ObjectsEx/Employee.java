package ObjectsEx;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employeName;
	private char employeeGrade;
	private BigDecimal salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  super.toString()+"title=" + title + ", employeName=" + employeName + ", employeeGrade=" + employeeGrade
				+ ", salary=" + salary + "";
	}
	
	

}
