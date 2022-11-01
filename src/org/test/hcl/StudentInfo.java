package org.test.hcl;

public class StudentInfo {
	
	private void studentDetails(int id) {
	System.out.println("student id:  " +id);	

	}
	private void studentDetails(String email) {
System.out.println("Student email: " +email);
	}
	
	private void studentDetails(Float phoneNumber) {
System.out.println("Student phonenumber" +phoneNumber);
	}
public static void main(String []args) {
	StudentInfo s= new StudentInfo();
	s.studentDetails(1234567890f);
	s.studentDetails(654789);
	s.studentDetails("muraligmail.com");
}

	


}
