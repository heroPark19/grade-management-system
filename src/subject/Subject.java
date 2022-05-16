package subject;

import java.util.Scanner;

public abstract class Subject implements SubjectInput{

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
		
	public abstract void printInfo();
	
	public void setSubjectName(Scanner input) {
		System.out.print("Subject name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setSubjectGrade(Scanner input) {
		System.out.print("Subject grade : ");
		double grade = input.nextDouble();
		this.setGrade(grade);
	}
	
	public String getKindString() {
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
		return skind;
	}
	
}
