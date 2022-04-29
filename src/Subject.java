
public class Subject {
	
	String name;
	double grade;

	public Subject() {
		
	}
	public Subject(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
		
	public void printInfo() {
		System.out.println("name : " +this.name + "grade : " +this.grade);
	}
	

}
