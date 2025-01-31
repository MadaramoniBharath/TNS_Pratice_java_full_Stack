
 package com.tkr.tnsif;

import java.util.Scanner;

public class EncapMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the sno:");
		int sno=sc.nextInt();
		System.out.println("please enter the name:");
		String name=sc.next();
		System.out.println("please enter the college name:");
		String college=sc.next();
		
		EncapSet en=new EncapSet();
		en.setSno(sno);
		en.setName(name);
		en.setCollege(college);
		System.out.println(en);
		System.out.println(en.toString1());
		System.out.println(en.toString2());
		System.out.println(en.source());
		System.out.println(en.teegala());
	
	
		

	}

}
