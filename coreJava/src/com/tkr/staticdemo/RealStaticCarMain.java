package com.tkr.staticdemo;

public class RealStaticCarMain {
 public static void main(String[] args) {
	RealStaticCar rsc=new RealStaticCar("swift",2020);
	RealStaticCar rsc1=new RealStaticCar("i20",2021);
	RealStaticCar rsc2=new RealStaticCar("crysta",2022);
	
	
	
	rsc.show();
	rsc1.show();
	rsc2.show();
	
	//changing the wheels 4 to 6 wheels 
	
	System.out.println("-----------------------------------------");
	System.out.println("now i have changed the wheels to 6 : ");
	System.out.println("----------------------------------------");
	RealStaticCar.setWheels(6);
	
	rsc.show();
	rsc1.show();
	rsc2.show();
}
}
