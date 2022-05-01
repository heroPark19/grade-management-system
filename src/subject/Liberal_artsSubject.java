package subject;

import java.util.Scanner;

public class Liberal_artsSubject extends Subject {
	
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

}