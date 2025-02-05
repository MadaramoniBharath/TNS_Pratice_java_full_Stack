package com.tkr.staticdemo;


public class RealStudentStatic {
	String name;
	String rollNumber;
	static String schoolName="TKREC(R9)" ;//static variable
	
	//creating paratmeterized constructer to initilize values to variables
			
		RealStudentStatic(String name,String rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
	}
		//creating getter and setter method to change the variable in another class
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRollNumber() {
			return rollNumber;
		}

		public void setRollNumber(String rollNumber) {
			this.rollNumber = rollNumber;
		}

		public static String getSchoolName() {
			return schoolName;
		}

		public static void setSchoolName(String schoolName) {
			RealStudentStatic.schoolName = schoolName;
		}
	//creating a method to print the details of college students
		
		public void show() {
			System.out.println("name is :"+name +"|roll no is:"+rollNumber + "|SchoolName is :"+schoolName);
			
		}
}
