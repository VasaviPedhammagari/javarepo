package com.casestudy;

import java.util.Scanner;

public class App {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	 App a=new App();
	 a.scenario1();
	 a.scenario2();
	 a.scenario3();
	}
    void scenario1() {
    	Student s1=new Student();
    	Student s2=new Student(102,"Akhil","14thOct1997");
    	Student s3=new Student(103,"Anitha","5thsep1998");
    	Info i=new Info();
    	i.display(s1);
    	i.display(s2);
    	i.display(s3);
    }
    void scenario2() {
    	Student[] s1=new Student[3];
    	s1[0]=new Student(104,"radha","7thaug1998");
    	s1[1]=new Student(105,"raghu","9thjuly1993");
    	s1[2]=new Student(106,"ramu","6thaug1996");
    	Info i=new Info();
    	for(Student s:s1) {
    	i.display(s);
       }
    }
    Student scenario3() {
     //Student[] s1=new Student[3];
    	int id;
    	String name;
    	String dob;
     //for(int y=0;y<3;y++) {
    	 System.out.println("enter student details:");
    	 id=sc.nextInt();
    	 name=sc.next();
    	 dob=sc.next();
    	 Student s1=new Student(id,name,dob);
    	 return s1;
      //Info i=new Info();
 	  //for(Student x:s1) {
 	    //i.display(x);
      //}
    }
}
