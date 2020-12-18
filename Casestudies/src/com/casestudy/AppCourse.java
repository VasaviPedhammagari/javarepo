package com.casestudy;

import java.util.Scanner;

public class AppCourse {
Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	 AppCourse a=new AppCourse();
	 a.scenario1();
	 a.scenario2();
	 a.scenario3();
	}
    void scenario1() {
    	Course c1=new Course();
    	Course c2=new Course(20,"Electronics");
    	Course c3=new Course(103,"Electrical");
    	Info i=new Info();
    	i.display(c1);
    	i.display(c2);
    	i.display(c3);
    }
    void scenario2() {
    	Course[] s1=new Course[3];
    	s1[0]=new Course(15,"Information Tech");
    	s1[1]=new Course(12,"Bio Science");
    	s1[2]=new Course(25,"Food tech");
    	Info i=new Info();
    	for(Course s:s1) {
    	i.display(s);
       }
    }
    Course scenario3() {
    	//Course[] s1=new Course[3];
    	int id;
    	String name;
    	//String duration;
     //for(int y=0;y<3;y++) {
    	 System.out.println("enter Course details:");
    	 id=sc.nextInt();
    	 name=sc.next();
    	 Course c1=new Course(id,name);
    	 return c1;
       //}	
      //Info i=new Info();
 	  //for(Course x:s1) {
 	    //i.display(x);
      //}
    }
}
