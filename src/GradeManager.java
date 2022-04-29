import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Subject subject;
	Scanner input;
	
	GradeManager(Scanner input){
		this.input = input;
	}	
	
	public void addsubject() {
		Subject subject = new Subject();
		System.out.print("Add your subject :");
		subject.name = input.next();
		System.out.print("Enter the subject's grade :");
		subject.grade = input.nextDouble();
		subjects.add(subject);
	}
	public void deletesubject() {
		System.out.print("Choose the subject you want to delete :");
		String subjectname = input.next();
		int index = -1;
		for (int i=0; i<subjects.size(); i++) {
			if (subjects.get(i).equals(subject.name)) {
			index = i;
			break;
		    }
		}
		
		if (index >= 0) {
			subjects.remove(index);
			System.out.println("The subject " + subjectname + " is deleted.");
		}
		else {
			System.out.println("The subject has not been registered.");
			return;
		}
	}

	public void Editsubjects() {
		System.out.print("Subject name : ");
		String subjectname = input.next();
		for(int i = 0; i<subjects.size(); i++) {
			Subject subjct = subjects.get(i);
			if (subject.equals(subject.name));{
				int num = -1;
				while(num != 3) {
					System.out.println("** subject info Edit Menu**");
					System.out.println("1. Edit name");
					System.out.println("2. Edit grade");
					System.out.println("3. Exit");
					System.out.println("Select ont number between 1-3 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Subject name : ");
						subject.name = input.next();
					}
					else if(num == 2) {
						System.out.print("Subject grade : ");
						subject.grade = input.nextDouble();
					}
					else {
						continue;
					}
				}
		    }
			break;
		}
	}
	
	public void Viewsubjects() {
//		System.out.println("Subject name : ");
//		String subjectname = input.next();
		for (int i = 0; i<subjects.size(); i++) {
			subjects.get(i).printInfo();
		}
	}

}
