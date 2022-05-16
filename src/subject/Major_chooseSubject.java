package subject;

import java.util.Scanner;

public class Major_chooseSubject extends Subject {
	
	public Major_chooseSubject(SubjectKind kind) {
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
