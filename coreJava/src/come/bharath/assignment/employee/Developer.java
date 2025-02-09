package come.bharath.assignment.employee;

import java.util.Scanner;

public class Developer extends Employee {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name=sc.nextLine();
		System.out.println("please enter your employee id:");
		int employeeid=sc.nextInt();
		System.out.println("please enter the salary:");
		float salary=sc.nextFloat();
		
		Developer dv = new Developer(); //created package to implement getter and setter method;
		dv.setName(name);
		dv.setEmployeeid(employeeid);
		dv.setSalary(salary);
		System.out.println(dv.toString());		//printing toString method
		dv.Developers();     //calling public method also to check is public will be accessible or not 
		
	}
}
