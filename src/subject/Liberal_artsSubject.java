package subject;

import java.util.Scanner;

public class Liberal_artsSubject extends Subject {
	
	public Liberal_artsSubject(SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSubjectName(input);
		setSubjectGrade(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind : " + skind + "name : " +this.name + "grade : " +this.grade);
	}
}
