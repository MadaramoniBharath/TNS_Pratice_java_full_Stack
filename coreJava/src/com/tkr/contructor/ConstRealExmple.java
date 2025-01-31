package com.tkr.contructor;

public class ConstRealExmple {
	
	//Declaring the variables 
	
	private int rollno;
	private String fullName;
	private String branch;
	
	//creating parameterized constructor
	
	public ConstRealExmple(int rollno, String fullName, String branch) {
		this.rollno = rollno;
		this.fullName = fullName;
		this.branch = branch;
	}
	
	//creating getter and setter methods to access variables in other class
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	//Print above variables by using two string methods
	@Override
	public String toString() {
		return "ConstRealExmple [rollno=" + rollno + ", fullName=" + fullName + ", branch=" + branch + "]";
	}

	
	
	 
	
	
	
	
	
	
	

}
