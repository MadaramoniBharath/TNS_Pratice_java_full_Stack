package com.tkr.constructor.realtime;

public class Product {
	//Declaring a variables 
	
	private String name;
	private double price;
	private int productId;
	private static int nextProductId=1;
	
	//creating constructer to take input and create the product id automatically 
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.productId = nextProductId++;
	}
	
	//creating a constructor to check the product detils(database)
	public Product(String name, double price, int productId) {
		super();
		this.name = name;
		this.price = price;
		this.productId = productId;
	}
	
	//creating getter and setter methods to access variables in another class
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	//creating method to display items
	 void displayProductInfo() {
		System.out.println("productname:"+name);
		System.out.println("price :" +price);
		System.out.println("product Id :"+productId);
		
		
		
	}
	
	
	
	
}
