package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("Employee Id:");
	}
	private void empName() {
		System.out.println("Employee Name:");
	}
	private void empDob() {
		System.out.println("Employee DOB:");
	}
	private void empPhone() {
		System.out.println("Employee Phone:");
	}
	private void empEmail() {
		System.out.println("Employee Email:");
	}
	private void empAddress() {
		System.out.println("Employee Address:");
	}
	
	public static void main(String[] args) {
	Employee E = new Employee();
	
	E.empId();
	E.empName();
	E.empDob();
	E.empEmail();
	E.empPhone();
	E.empAddress();

}

	
}