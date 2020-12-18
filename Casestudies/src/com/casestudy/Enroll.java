package com.casestudy;

import java.time.LocalDate;

public class Enroll {
    private Student student;
    private Course course;
    private LocalDate Enrolldate;
	public Enroll(Student student, Course course, LocalDate enrolldate) {
		this.student = student;
		this.course = course;
		Enrolldate = enrolldate;
	}
    void getdetails() {
    	student.getdetails();
    	course.getdetails();
    	System.out.println("Enrolled date ="+Enrolldate);
    	}
}
