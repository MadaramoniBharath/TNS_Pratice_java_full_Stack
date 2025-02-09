package come.bharath.assignment.employee;

public class Employee {
	
	private String name;
	private int employeeid;
	private float salary;
	
	//implementing getter and setter method to access in another class or package
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	//printing the attributes 
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeid=" + employeeid + ", salary=" + salary + "]";
	}
	
	//creating a public method to access in other classes 
		public void Developers() {
			System.out.println("Am i accessible in other classes?");
		}
	}
	
	

