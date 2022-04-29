package subject;

import java.util.Scanner;

public class Subject {

	protected String name;
	protected double grade;

	public Subject() {
		
	}
	public Subject(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	protected SubjectKind Kind = SubjectKind.Major_required;
	public SubjectKind getKind() {
		return Kind;
	}
	public void setKind(SubjectKind kind) {
		Kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
		
	public void printInfo() {
		System.out.println("name : " +this.name + "grade : " +this.grade);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Add your subject :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Enter the subject's grade :");
		double grade = input.nextDouble();
		this.setGrade(grade);
	}

}
