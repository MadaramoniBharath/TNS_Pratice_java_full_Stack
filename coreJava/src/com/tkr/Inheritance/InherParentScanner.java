package com.tkr.Inheritance;

import java.util.Scanner;

public class InherParentScanner extends InherChildScanner {
	public void sub() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Please Enter First Number to to minus: ");
		int firstNumber=sc.nextInt();
		System.out.print("Please Enter Second Number to do minus: ");
		int SecondNumber=sc.nextInt();
		int sub=(firstNumber - SecondNumber);
		System.out.println("the Subtraction of Two Numbers are : "+sub);
	}
	public void mul() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Please Enter First Number to do Multiplication: ");
		int firstNumber=sc.nextInt();
		System.out.print("Please Enter Second Number to do Multiplication: ");
		int SecondNumber=sc.nextInt();
		int mul=(firstNumber * SecondNumber);
		System.out.println("the Multiplication of Two Numbers are : "+mul);
	}
	public void divison() {
		Scanner sc =new Scanner(System.in);
		System.out.print("Please Enter First Number to division: ");
		int firstNumber=sc.nextInt();
		System.out.print("Please Enter Second Number to division: ");
		int SecondNumber=sc.nextInt();
		int div=(firstNumber / SecondNumber);
		System.out.println("the Division of Two Numbers are : "+div);
	}
}
