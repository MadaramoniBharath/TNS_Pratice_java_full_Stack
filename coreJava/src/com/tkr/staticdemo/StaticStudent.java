package com.tkr.staticdemo;

public class StaticStudent {
	int rollno;
	String name;
	static String college="tkr";
			
	StaticStudent(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public void show() {
		System.out.println("the rollno is :"+rollno + " the name is :"+name + " the college is :"+college);
	}
}
