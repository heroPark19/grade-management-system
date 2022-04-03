import java.util.Scanner;

public class GradeManager {
	Subject subject;
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}	
	
	public void addsubject() {
		subject = new Subject();
		System.out.print("Add your subject :");
		subject.name = input.next();
		System.out.print("Enter the subject's grade :");
		subject.grade = input.nextInt();
	}
	public void deletesubject() {
		System.out.print("Choose the subject you want to delete :");
		String sub = input.next();
		input.nextLine();
		
		if (sub.equals(subject.name)) {
			subject = null;
			System.out.println("The subject is deleted.");
		}
		else {
			System.out.println("The subject has not been registered.");
			return;
		}
	}

	public void recordgrade() {
		System.out.print("Selcect a subject :");
		String sub = input.next();
		System.out.print("Record your grade :");
		double grade = input.nextDouble();
		if (subject.name.equalsIgnoreCase(sub)) {
			System.out.println("The sublect to be recorded");
		}
		else {
			System.out.println("The subject has not been registered.");
		}
	}
	public void totalgrade() {
		System.out.println("Your total grade is");
	}

}
