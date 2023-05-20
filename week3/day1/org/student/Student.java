package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {
	
	public void studentName(String name) {
		System.out.println("The student name is "+name);

	}
	public void studentDept(String department) {
		System.out.println("The student department is "+department);

	}
	public void studentId(int id) {
		System.out.println("The student id is "+id);

	}
	public static void main(String[] args) {
		Student stud= new Student();
		stud.collegeName("V.S.B Engineering College");
		stud.collegeCode(972);
		stud.collegeRank(1);
		stud.deptName("Computer Science and Engineering");
		stud.studentName("selvapriyanka");
		stud.studentDept("CSE");
		stud.studentId(972079);
	}
}
