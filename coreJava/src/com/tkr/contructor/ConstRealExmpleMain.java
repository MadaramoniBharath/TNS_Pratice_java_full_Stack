package com.tkr.contructor;

import java.util.Scanner;

public class ConstRealExmpleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the roll no: ");
		int rollno = sc.nextInt();
		
		System.out.println("please Enter Full Name of the Student: ");
		String fullName=sc.next();
		
		System.out.println("please Enter your Branch: ");
		String branch=sc.next();
	
	
	//creating object of ConstRealExmple to acess variables
	
	ConstRealExmple cr1 = new ConstRealExmple(rollno,fullName,branch);
	
		System.out.println(cr1.toString());
	
	
	
}

}