package com.tkr.contructor;

public class ConstUsingThis {
	int a;
	int b;
	
			ConstUsingThis(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("this is a :" +a);
		System.out.println("this is b :" +b);
		
	}
			public static void main(String[] args) {
				ConstUsingThis cu=new ConstUsingThis(10,20);
			}

}
