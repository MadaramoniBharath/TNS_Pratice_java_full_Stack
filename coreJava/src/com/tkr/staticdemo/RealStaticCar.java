package com.tkr.staticdemo;

public class RealStaticCar {
	String carName;
	int carModel;
	static int wheels=4;
	
	RealStaticCar(String name,int model){
		this.carName=name;
		this.carModel=model;
	}
	
	//creating getter and setter method to change the static variable in future 
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public int getCarModel() {
		return carModel;
	}


	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}


	public static int getWheels() {
		return wheels;
	}


	public static void setWheels(int wheels) {
		RealStaticCar.wheels = wheels;
	}


	public void show() {
		System.out.println("careName:"+carName +"|carModel:" +carModel + "|wheels : "+wheels);
	}
}
