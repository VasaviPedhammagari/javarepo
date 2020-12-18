package com.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class AppEngine {
	ArrayList<Student> students=new ArrayList<>();
    HashSet<Course>  courses=new HashSet<>();
    ArrayList<Enroll>  enrol=new ArrayList<>();
    
   public void register(Student student) {
	 System.out.println("Hello");  //practice of git
	 students.add(student);
   }
   public void introduce(Course course) {
	 System.out.println("Hello");  //practice of git 
	   courses.add(course);
	   }
   public void enroll(Student student,Course course) {
	     LocalDate date=LocalDate.now();
	     Enroll E=new Enroll(student,course,date);
		 enrol.add(E);
	   }
   public ArrayList<Student> listOfStudents() {
	    return students;
   }
   public HashSet<Course> listOfCourses() {
	    return courses;
   }
   public ArrayList<Enroll> listOfEnrollments() {
	    return enrol;
   }
}
