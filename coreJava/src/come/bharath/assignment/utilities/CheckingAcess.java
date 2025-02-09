package come.bharath.assignment.utilities;
import java.util.Scanner;

import  come.bharath.assignment.employee.*;
public class CheckingAcess extends Employee{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name=sc.nextLine();
		System.out.println("please enter your employee id:");
		int employeeid=sc.nextInt();
		System.out.println("please enter the salary:");
		float salary=sc.nextFloat();
		
		CheckingAcess ca = new CheckingAcess();
		ca.setName(name);
		ca.setEmployeeid(employeeid);
		ca.setSalary(salary);
		//acessing to string method
		System.out.println(ca.toString());
		
		//acessing developer public method to here
		
		ca.Developers();
	}
}
