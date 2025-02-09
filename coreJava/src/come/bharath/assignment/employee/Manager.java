package come.bharath.assignment.employee;

import java.util.Scanner;

public class Manager extends Employee {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter your name:");
	String name=sc.nextLine();
	System.out.println("please enter your employee id:");
	int employeeid=sc.nextInt();
	System.out.println("please enter the salary:");
	float salary=sc.nextFloat();
	
	Manager mn= new Manager();
	mn.setName(name);
	mn.setEmployeeid(employeeid);
	mn.setSalary(salary);
	System.out.println(mn.toString());
	
	}
	
}
