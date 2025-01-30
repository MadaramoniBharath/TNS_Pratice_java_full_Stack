package com.tkr.Inheritance;

import java.util.Scanner;

public class InherChildScanner {
	public void sum() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Please Enter First Number to do sum: ");
		int firstNumber=sc.nextInt();
		System.out.print("Please Enter Second Number to do sum: ");
		int SecondNumber=sc.nextInt();
		int sum=(firstNumber + SecondNumber);
		System.out.println("the Sum of Two Numbers are : "+sum);
		
		
	}

}
