package com.tkr.constructor.realtime;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the employee name:");
		String name=sc.next();
		System.out.println("please enter the unique id :");
		int id = sc.nextInt();
		System.out.println("please enter the salary");
		double salary=sc.nextDouble();
		Employee em = new Employee(name,id,salary);
		em.displayEmployeeDetails();
		
		}
	

}
