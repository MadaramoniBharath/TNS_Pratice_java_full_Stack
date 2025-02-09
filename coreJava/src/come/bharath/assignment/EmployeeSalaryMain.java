package come.bharath.assignment;

import java.util.Scanner;

public class EmployeeSalaryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name:");
		String employeeName=sc.nextLine();
		System.out.println("enter employee id:");
		int employeeId=sc.nextInt();
		System.out.println("enter employee basic salary:");
		double employeeBasicSalary=sc.nextDouble();
		SalaryEmployee se= new SalaryEmployee(employeeName,employeeId,employeeBasicSalary);
		System.out.println(se.calEmployeeSalary());
		System.out.println(se.toString());
	}
}
