package com.tkr.staticdemo;

public class RealStudentStaticMain {
	
	public static void main(String[] args) {
		
	
	//calling constructer by using object creation
	
	RealStudentStatic rss= new RealStudentStatic("bharath","22R95A7411");
	RealStudentStatic rss1= new RealStudentStatic("sai","22R95A7402");
	RealStudentStatic rss2= new RealStudentStatic("mani","22R95A7422");
	
	rss.show();
	rss1.show();
	rss2.show();
	

	//according to question changing school to TKR(R9) to TKRCET(R9) by using setter method.
	System.out.println("-------------------------------------------");
	System.out.println("after changing college name to tkr(k9) ");
	System.out.println("--------------------------------------");
	//before that we need to create a object for "RealStudentStatic" class to acess setter method
	RealStudentStatic.setSchoolName("tkrcet(k9)"); //changed tkrec to tkrcet 
	rss.show();
	rss1.show();
	rss2.show();
	
			
}
}
