package coreJava;

import java.util.Scanner;
public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first digit to do Arithmetic Calulation:");
		int a=sc.nextInt();
		System.out.print("Please enter second digit to Arithmetic Calulation:");
		int b=sc.nextInt();
		System.out.println("the sum of two digits is : "+(a+b));
		System.out.println("the subtraction of two digits is : "+(a-b));
		System.out.println("the multiplication of two digits is : "+(a*b));
		System.out.println("the divison of two digits is : "+(a/b));
		System.out.println("the percentage of two digits is : "+(a%b));
		
	}
	

}
