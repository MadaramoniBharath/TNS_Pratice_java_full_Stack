package come.bharath.assignment.constructer;

public class StudentResults {
	private String fullName;
	private String rollNo;
	private double percentage;
	private String grade;
	
	
	StudentResults(String fullName,String rollNo,double percentage){
		this.fullName=fullName;
		this.rollNo=rollNo;
		this.percentage=percentage;
		this.grade=calculateGrade();
	}
		


			@Override
			public String toString() {
				return "StudentResults [fullName=" + fullName + ", rollNo=" + rollNo + ", percentage=" + percentage + " grade="+grade
						+ "]";
			}
			public String calculateGrade() {
				if(percentage >=75 && percentage <100) {
					grade="A";
				}
				else if(percentage >=50 && percentage <74) {
					grade="B";
					
				}
				else if(percentage >=35 && percentage<49) {
					grade="c";
				}
				else if(percentage <34) {
					grade="fail";
				}
				else{
					grade="N/A";
				}
				return grade;
				
			}
			
}

	
	


