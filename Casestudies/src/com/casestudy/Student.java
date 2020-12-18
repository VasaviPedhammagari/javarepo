package com.casestudy;

public class Student {
  private int id;
  private String name;
  private String dob;
  Student(){
	  id=101;
	  name="amith";
	  dob="12thNov1998";
  }
  Student(int sid,String sname,String dob){
	  id=sid;
	  name=sname;
	  this.dob=dob;
  }
  void setdetails(int sid,String sname,String dob){
	  id=sid;
	  name=sname;
	  this.dob=dob;
  }
  void getdetails() {
	  System.out.println("student id = "+id);
	  System.out.println("student name = "+name);
	  System.out.println("student date of birth = "+dob);
  }
}
