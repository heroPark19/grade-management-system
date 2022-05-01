package subject;

import java.util.Scanner;

public class Subject {

	protected String name;
	protected double grade;
	protected SubjectKind kind = SubjectKind.Major_required;

	public Subject() {
		
	}
	
	public Subject(SubjectKind kind) {
		this.kind = kind;
	}
	
	public Subject(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public Subject(SubjectKind kind, String name, double grade) {
		this.kind = kind;
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
		String skind = "none";
		switch(this.kind) {
		case Major_required :
			skind = "Major_req.";
			break;
			
		case Major_choose :
			skind = "Major_cho.";
			break;
			
		case Liberal_arts :
			skind = "Lib._arts";
			break;
			
		default:
			
		}
			
		System.out.println("Kind : " + skind + "name : " +this.name + "grade : " +this.grade);
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
