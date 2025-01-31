package com.tkr.constructor.realtime;

public class Employee {
	private String name;
	private int id;
	private double salary;
	
	// Creating a parameterized constructor that accepts name , salary and id as a arguments and intilizes instance varaibles
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	//Creating getter and setter methods to access this variables at another class
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//creating a method to print the employee name,id,salary
	
	void displayEmployeeDetails() {
		System.out.println("employee name:"+name + " employee id :" +id + " Employee Salary :" +salary );
	}
	
	
}
