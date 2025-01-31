package com.tkr.contructor;

public class ConstParam {
	ConstParam(){
		System.out.println("its is an default parameter");
		
	}
	//creating a parameterized constructor with two arguments
	ConstParam(int rollno,String fullName,String branch){
		System.out.println("rollno is :"+rollno + " fullname is: "+fullName + " Branch is :"+branch);
	}
	
	ConstParam(String fatherName,String motherName,int fatherIncome) {
		System.out.println("fatherName is :"+fatherName + " motherName is "+motherName + " fatherIncome is "+fatherIncome);
		
	}
    //Main Method
	public static void main(String[] args) {
		ConstParam ct=new ConstParam();
		ConstParam ct1=new ConstParam(7411,"Madaramoni Bharath","CSD");
		ConstParam ct2=new ConstParam("Madaramoni Anjaiah","Madaramoni Santhosha",150000);
	}
}
