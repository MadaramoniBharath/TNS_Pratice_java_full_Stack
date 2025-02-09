package come.bharath.assignment.constructer;

import java.util.Scanner;

public class StudentResultsMain{


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the full name of Student:");
		String fullName=sc.nextLine();
		System.out.println("Enter the roll no of Student:");
		String rollNo=sc.next();
		System.out.println("enter the percentage of student:");
		double percentage=sc.nextDouble();
		
		StudentResults sr=new StudentResults(fullName,rollNo,percentage);
		
		System.out.println(sr.toString());
		
		
		
		
	}
}
