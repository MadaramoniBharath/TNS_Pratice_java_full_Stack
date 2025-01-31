package com.tkr.constructor.realtime;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pr = new Product("laptop",58000);
		Product pr1=new Product("Keyboard",1200);
		Product pr2 = new Product("Adapter",1500);
		Product pr3=new Product("mouse",1200.00,105);
		
		pr.displayProductInfo();
		pr1.displayProductInfo();
		pr2.displayProductInfo();
		
		pr3.displayProductInfo();
		
	}

}
