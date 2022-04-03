
public class Subject {
	
	String name;
	int grade;

	public Subject() {
		
	}
	public Subject(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println("name : " +this.name + "grade : " +this.grade);
	}

}
