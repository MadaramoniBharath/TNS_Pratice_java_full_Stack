package come.bharath.assignment;

public class SalaryEmployee {
	private String employeeName;
	private int employeeId;
	private double employeeBasicSalary;
	private double employeeNetSalary;
	
	
	
	//creating a constucter to installize the values
	public SalaryEmployee(String employeeName, int employeeId, double employeeBasicSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeBasicSalary = employeeBasicSalary;
		this.employeeNetSalary=calEmployeeSalary();
	}

	@Override
	public String toString() {
		return "SalaryEmployee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeBasicSalary="
				+ employeeBasicSalary + ", employeeNetSalary=" + employeeNetSalary + "]";
	}
	
	
	public double calEmployeeSalary() {
		double hra= 0.20*employeeBasicSalary;
		 double da=0.15*employeeBasicSalary;
		 double taxDed=0.10*employeeBasicSalary;
		return employeeBasicSalary+hra+da-taxDed;

	}
}
