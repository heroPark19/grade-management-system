package subject;

import java.util.Scanner;

public class Liberal_artsSubject extends Subject implements SubjectInput{
	
	public Liberal_artsSubject(SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Add your subject :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Enter the subject's grade :");
		double grade = input.nextDouble();
		this.setGrade(grade);
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

}
