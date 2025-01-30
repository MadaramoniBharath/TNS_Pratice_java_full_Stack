package com.tkr.tnsif;

import java.util.Scanner;

public class TaxMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the name:");
		String name=sc.nextLine();
		System.out.print("Please enter the name:");
		int income=sc.nextInt();
		System.out.print("Please enter the name:");
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		TaxCalculation tt = new TaxCalculation();
		tt.calTax(pp);
		
		System.out.println("After tax calulation:");
		System.out.println(pp);
		
	}

}
