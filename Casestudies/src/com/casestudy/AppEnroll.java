package com.casestudy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AppEnroll {
	
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		HashSet<Course>  courses=new HashSet<>();
	    ArrayList<Enroll>  enrol=new ArrayList<>();
	    Scanner sc=new Scanner(System.in);
	    String choice="y";
	    AppEngine Ae=new AppEngine();
	    AppCourse Ac=new AppCourse();
	    App a=new App();
	    while(choice.equals("y")) {
             Student s=a.scenario3();
             Course  c=Ac.scenario3();
			 Ae.register(s);	  
			 Ae.introduce(c);
			 Ae.enroll(s,c);
			 System.out.println("do you want to enrol another student");
			 choice=sc.next();
		 }
	    students=Ae.listOfStudents();
	    courses=Ae.listOfCourses();
	    enrol=Ae.listOfEnrollments();
	    Iterator itr=students.iterator();
	    System.out.println("List of Students:");
	    while(itr.hasNext()) {
	    	Student s=(Student)itr.next();
	    	s.getdetails();
	    }
	    Iterator itrc=courses.iterator();
	    System.out.println("Courses:");
	    while(itrc.hasNext()) {
	    	Course s=(Course)itrc.next();
	    	s.getdetails();
	    }
	    Iterator itre=enrol.iterator();
	    System.out.println("List of enrolled Students with courses:");
	    while(itre.hasNext()) {
	    	Enroll s=(Enroll)itre.next();
	    	s.getdetails(); 
	}
}
}	
