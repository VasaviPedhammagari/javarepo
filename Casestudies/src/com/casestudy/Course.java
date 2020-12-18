package com.casestudy;

public class Course {
	  private int id;
	  private String name;
	  private String duration;
	  Course(){
		  id=10;
		  name="computers";
		  duration="2hrs";
	  }
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id != other.id)
			return false;
		return true;
	}
	Course(int cid,String cname){
		  id=cid;
		  name=cname;
		  this.duration="2hrs";
	  }
	  void setdetails(int cid,String cname,String duration){
		  id=cid;
		  name=cname;
		  this.duration=duration;
	  }
	  void getdetails() {
		  System.out.println("Course id = "+id);
		  System.out.println("Course name = "+name);
		  System.out.println("Course duration = "+duration);
	  }
}
