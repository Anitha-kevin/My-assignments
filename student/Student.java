package org.student;

import org.department.Department;

public class Student extends Department {
	private void studentName() {
	System.out.println("student name: Anitha");
    }
    private void studentDept() {
	System.out.println("student dept: IT");
    }
    private void studentId() {
	System.out.println("student id: 1234567");
    }
    public static void main(String[] args) {
		Student report=new Student();
		report.collegeName();
		report.collegeCode();
		report.collegeRank();
		report.departmentName();
		report.studentName();
		report.studentDept();
		report.studentId();
		}
}

