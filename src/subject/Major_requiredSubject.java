package subject;

import java.util.Scanner;

public class Major_requiredSubject extends Subject {
	
	public Major_requiredSubject(SubjectKind kind) {
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
